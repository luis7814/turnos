package com.asw.shifts.facade;

import com.asw.shifts.data.dto.TradesServiceDto;
import com.asw.shifts.service.ServiceService;
import com.asw.shifts.service.TradeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class TradeFacadeTest {
    @Mock
    TradeService tradeService;
    @Mock
    ServiceService serviceService;
    @InjectMocks
    TradeFacade tradeFacade;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSave() {
        TradesServiceDto result = tradeFacade.save(new TradesServiceDto());
        Assertions.assertNotNull(result.getIdTrade());
    }
}
