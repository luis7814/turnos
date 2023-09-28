package com.asw.shifts.facade;

import com.asw.shifts.data.dto.ShiftDto;
import com.asw.shifts.service.ShiftService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import java.util.List;

import static org.mockito.Mockito.*;

class ShiftFacadeTest {
    @Mock
    Logger log;
    @Mock
    ShiftService shiftService;
    @InjectMocks
    ShiftFacade shiftFacade;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGenerateShift() {
        when(shiftService.generateShift(any())).thenReturn(List.of(new ShiftDto()));

        List<ShiftDto> result = shiftFacade.generateShift(new ShiftDto());
        Assertions.assertEquals(List.of(new ShiftDto()), result);
    }

    @Test
    void testFindByIdService() {
        when(shiftService.findByIdService(anyInt())).thenReturn(List.of(new ShiftDto()));

        List<ShiftDto> result = shiftFacade.findByIdService(Integer.valueOf(0));
        Assertions.assertEquals(List.of(new ShiftDto()), result);
    }
}
