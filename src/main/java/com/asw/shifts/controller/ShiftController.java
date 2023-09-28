package com.asw.shifts.controller;

import com.asw.shifts.data.dto.ShiftDto;
import com.asw.shifts.facade.ShiftFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shift")
public class ShiftController {

    Logger log = LoggerFactory.getLogger(ShiftController.class);

    @Autowired
    private ShiftFacade shiftFacade;

    @PostMapping
    public ResponseEntity<List<ShiftDto>> generateShift(@RequestBody ShiftDto shiftDto) {
        log.info("Init process");
        return new ResponseEntity<>(shiftFacade.generateShift(shiftDto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<ShiftDto>> findByService(@RequestParam Integer id) {
        return new ResponseEntity<>(shiftFacade.findByIdService(id), HttpStatus.OK);
    }
}
