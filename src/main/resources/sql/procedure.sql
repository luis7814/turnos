create or replace NONEDITIONABLE PROCEDURE crear_turnos (
    p_fecha_inicio IN DATE,
    p_fecha_fin IN DATE,
    p_id_servicio IN NUMBER
) IS
    v_hora_apertura TIMESTAMP;
    v_hora_cierre TIMESTAMP;
    v_duracion NUMBER;
    v_hora_actual TIMESTAMP;
    v_id_comercio NUMBER;
BEGIN
    -- Obtener detalles del servicio
    SELECT hora_apertura, hora_cierre, duracion, id_comercio
    INTO v_hora_apertura, v_hora_cierre, v_duracion, v_id_comercio
    FROM Servicios
    WHERE id_servicio = p_id_servicio;

    FOR i IN 0..(p_fecha_fin - p_fecha_inicio) LOOP
        v_hora_actual := v_hora_apertura;

        WHILE v_hora_actual + NUMTODSINTERVAL(v_duracion, 'MINUTE') <= v_hora_cierre LOOP
            INSERT INTO Turnos (id_turno, id_servicio, fecha_turno, hora_inicio, hora_fin, estado)
            VALUES (seq_id_turno.NEXTVAL, p_id_servicio, p_fecha_inicio + i, v_hora_actual, v_hora_actual + NUMTODSINTERVAL(v_duracion, 'MINUTE'), 1);

            v_hora_actual := v_hora_actual + NUMTODSINTERVAL(v_duracion, 'MINUTE');
        END LOOP;
    END LOOP;

    COMMIT;
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        RAISE;
END crear_turnos;