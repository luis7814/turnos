package com.asw.shifts.service;

import com.asw.shifts.controller.ShiftController;
import com.asw.shifts.data.dto.TradesServiceDto;
import com.asw.shifts.repository.ServiceRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {

    Logger log = LoggerFactory.getLogger(ServiceService.class);

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void save(TradesServiceDto tradesServiceDto) {
        log.info("save trade and service");
        serviceRepository.save(modelMapper.map(tradesServiceDto, com.asw.shifts.data.entities.Service.class));
    }
}
