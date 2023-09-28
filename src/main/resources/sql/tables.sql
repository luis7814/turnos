-- Tabla para almacenar la información de los comercios
CREATE TABLE Comercios (
    id_comercio NUMBER PRIMARY KEY,
    nom_comercio VARCHAR2(255) NOT NULL
);

-- Tabla para almacenar la información de los servicios que presta cada comercio
CREATE TABLE Servicios (
    id_servicio NUMBER PRIMARY KEY,
    id_comercio NUMBER,
    nom_servicio VARCHAR2(255) NOT NULL,
    hora_apertura TIMESTAMP NOT NULL,
    hora_cierre TIMESTAMP NOT NULL,
    duracion_minutos NUMBER NOT NULL,
    FOREIGN KEY (id_comercio) REFERENCES Comercios(id_comercio)
);

-- Tabla para almacenar los turnos generados
CREATE TABLE Turnos (
    id_turno NUMBER PRIMARY KEY,
    id_servicio NUMBER,
    fecha_turno DATE NOT NULL,
    hora_inicio TIMESTAMP NOT NULL,
    hora_fin TIMESTAMP NOT NULL,
    FOREIGN KEY (id_servicio) REFERENCES Servicios(id_servicio)
);
