package com.asw.shifts.data.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "servicios")
public class Service {

    @Id
    @Column(name = "ID_SERVICIO")
    private Long idService;
    @Column(name = "ID_COMERCIO")
    private Long idTrade;
    @Column(name = "NOM_SERVICIO")
    private String serviceName;
    @Column(name = "HORA_APERTURA")
    private Timestamp startTime;
    @Column(name = "HORA_CIERRE")
    private Timestamp endTime;
    @Column(name = "DURACION")
    private Integer duration;

}
