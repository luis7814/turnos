package com.asw.shifts.service;

import com.asw.shifts.data.dto.TradesServiceDto;
import com.asw.shifts.repository.TradeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;

import static org.mockito.Mockito.*;

class TradeServiceTest {
    @Mock
    Logger log;
    @Mock
    TradeRepository tradeRepository;
    @Mock
    ModelMapper modelMapper;
    @InjectMocks
    TradeService tradeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSave() {
        tradeService.save(new TradesServiceDto());
    }
}

