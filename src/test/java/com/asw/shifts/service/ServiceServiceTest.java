package com.asw.shifts.service;

import com.asw.shifts.data.dto.TradesServiceDto;
import com.asw.shifts.repository.ServiceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;

import static org.mockito.Mockito.*;

class ServiceServiceTest {
    @Mock
    Logger log;
    @Mock
    ServiceRepository serviceRepository;
    @Mock
    ModelMapper modelMapper;
    @InjectMocks
    ServiceService serviceService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSave() {
        serviceService.save(new TradesServiceDto());
    }
}
