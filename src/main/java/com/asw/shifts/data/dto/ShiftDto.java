package com.asw.shifts.data.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class ShiftDto implements Serializable {

    private Integer idShift;
    private Integer idService;
    private LocalDate dateShift;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Date startDate;
    private Date endDate;
    private Integer estate;


}
