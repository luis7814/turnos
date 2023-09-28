package com.asw.shifts.service;

import com.asw.shifts.controller.ShiftController;
import com.asw.shifts.data.dto.TradesServiceDto;
import com.asw.shifts.data.entities.Trade;
import com.asw.shifts.repository.TradeRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeService {

    Logger log = LoggerFactory.getLogger(TradeService.class);

    @Autowired
    private TradeRepository tradeRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void save(TradesServiceDto tradesServiceDto) {
        log.info("save trade and service");
        tradeRepository.save(modelMapper.map(tradesServiceDto, Trade.class));
    }
}
