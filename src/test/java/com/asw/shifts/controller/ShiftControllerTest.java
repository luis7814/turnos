package com.asw.shifts.controller;

import com.asw.shifts.data.dto.ShiftDto;
import com.asw.shifts.facade.ShiftFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.mockito.Mockito.*;

class ShiftControllerTest {
    @Mock
    Logger log;
    @Mock
    ShiftFacade shiftFacade;
    @InjectMocks
    ShiftController shiftController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGenerateShift() {
        when(shiftFacade.generateShift(any())).thenReturn(List.of(new ShiftDto()));

        ResponseEntity<List<ShiftDto>> result = shiftController.generateShift(new ShiftDto());
        Assertions.assertEquals("200 OK", result.getStatusCode().toString());
    }

    @Test
    void testFindByService() {
        when(shiftFacade.findByIdService(anyInt())).thenReturn(List.of(new ShiftDto()));

        ResponseEntity<List<ShiftDto>> result = shiftController.findByService(Integer.valueOf(0));
        Assertions.assertEquals("200 OK", result.getStatusCode().toString());
    }
}
