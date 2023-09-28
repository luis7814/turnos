package com.asw.shifts.service;

import com.asw.shifts.controller.ShiftController;
import com.asw.shifts.data.dto.ShiftDto;
import com.asw.shifts.repository.ShiftRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShiftService {

    Logger log = LoggerFactory.getLogger(ShiftService.class);

    @Autowired
    private ShiftRepository shiftRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<ShiftDto> generateShift(ShiftDto shiftDto) {
        log.info("generate shift init");
        shiftRepository.crearTurnos(
                shiftDto.getStartDate(), shiftDto.getEndDate(), shiftDto.getIdService());
        return findByIdService(shiftDto.getIdService());

    }

    public List<ShiftDto> findByIdService(Integer id) {
        log.info("find by service");
        return shiftRepository.findByIdService(id).stream()
                .map(shift -> modelMapper.map(shift, ShiftDto.class))
                .collect(Collectors.toList());
    }
}
