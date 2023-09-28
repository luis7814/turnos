package com.asw.shifts.facade;

import com.asw.shifts.data.dto.TradesServiceDto;
import com.asw.shifts.service.ServiceService;
import com.asw.shifts.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class TradeFacade {

    @Autowired
    private TradeService tradeService;

    @Autowired
    private ServiceService serviceService;

    @Transactional
    public TradesServiceDto save(TradesServiceDto tradesServiceDto) {

        tradesServiceDto.setIdTrade(System.currentTimeMillis());
        tradeService.save(tradesServiceDto);
        serviceService.save(tradesServiceDto);

        return tradesServiceDto;

    }
}
