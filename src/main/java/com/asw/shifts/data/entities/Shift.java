package com.asw.shifts.data.entities;

import com.asw.shifts.data.dto.ShiftDto;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "turnos")
@NamedStoredProcedureQuery(
        name = "crear_turnos",
        procedureName = "crear_turnos",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_fecha_inicio", type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_fecha_fin", type = Date.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "p_id_servicio", type = Long.class)
        }
)
public class Shift {

    @Id
    @Column(name = "id_turno")
    private Integer idShift;

    @Column(name = "id_servicio")
    private Integer idService;

    @Column(name = "fecha_turno")
    private LocalDate dateShift;

    @Column(name = "hora_inicio")
    private LocalDateTime startTime;

    @Column(name = "hora_fin")
    private LocalDateTime endTime;

    @Column(name = "estado")
    private Integer estate;


}
