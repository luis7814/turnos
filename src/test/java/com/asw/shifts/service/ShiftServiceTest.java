package com.asw.shifts.service;

import com.asw.shifts.data.dto.ShiftDto;
import com.asw.shifts.data.entities.Shift;
import com.asw.shifts.repository.ShiftRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;

import java.util.List;

import static org.mockito.Mockito.*;

class ShiftServiceTest {
    @Mock
    Logger log;
    @Mock
    ShiftRepository shiftRepository;
    @Mock
    ModelMapper modelMapper;
    @InjectMocks
    ShiftService shiftService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGenerateShift() {
        when(shiftRepository.findByIdService(anyInt())).thenReturn(List.of(new Shift()));

        List<ShiftDto> result = shiftService.generateShift(new ShiftDto());
        Assertions.assertNotNull(result);
    }

    @Test
    void testFindByIdService() {
        when(shiftRepository.findByIdService(anyInt())).thenReturn(List.of(new Shift()));

        List<ShiftDto> result = shiftService.findByIdService(Integer.valueOf(0));
        Assertions.assertNotNull(result);
    }
}
