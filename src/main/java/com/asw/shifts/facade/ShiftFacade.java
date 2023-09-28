package com.asw.shifts.facade;

import com.asw.shifts.data.dto.ShiftDto;
import com.asw.shifts.service.ShiftService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShiftFacade {

    Logger log = LoggerFactory.getLogger(ShiftFacade.class);

    @Autowired
    private ShiftService shiftService;

    public List<ShiftDto> generateShift(ShiftDto shiftDto) {
        log.info("init facade");
        return shiftService.generateShift(shiftDto);
    }

    public List<ShiftDto> findByIdService(Integer id){
        log.info("init facade");
        return shiftService.findByIdService(id);
    }
}
