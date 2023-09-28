package com.asw.shifts.data.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class TradesServiceDto implements Serializable {

    private Long idService;
    private Long idTrade;
    private String serviceName;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer duration;
    private String nameTrade;
}
