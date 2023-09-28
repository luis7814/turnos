package com.asw.shifts.repository;

import com.asw.shifts.data.dto.ShiftDto;
import com.asw.shifts.data.entities.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ShiftRepository extends JpaRepository<Shift, Integer> {

    //@Query(value = "{ call crear_turnos(:p_fecha_inicio, :p_fecha_fin, :p_id_servicio) }", nativeQuery = true)
    @Procedure(name = "crear_turnos")
    void crearTurnos(@Param("p_fecha_inicio") Date fechaInicio, @Param("p_fecha_fin") Date fechaFin, @Param("p_id_servicio") Integer idServicio);

    List<Shift> findByIdService(Integer id);


}
