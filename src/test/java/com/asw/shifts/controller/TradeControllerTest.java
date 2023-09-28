package com.asw.shifts.controller;

import com.asw.shifts.data.dto.TradesServiceDto;
import com.asw.shifts.facade.TradeFacade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;

class TradeControllerTest {
    @Mock
    Logger log;
    @Mock
    TradeFacade tradeFacade;
    @InjectMocks
    TradeController tradeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSave() {
        when(tradeFacade.save(any())).thenReturn(new TradesServiceDto());

        ResponseEntity<TradesServiceDto> result = tradeController.save(new TradesServiceDto());
        Assertions.assertEquals("200 OK", result.getStatusCode().toString());
    }
}
