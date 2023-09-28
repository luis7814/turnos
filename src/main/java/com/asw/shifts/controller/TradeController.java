package com.asw.shifts.controller;

import com.asw.shifts.data.dto.TradesServiceDto;
import com.asw.shifts.facade.TradeFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trade")
public class TradeController {

    Logger log = LoggerFactory.getLogger(TradeController.class);

    @Autowired
    private TradeFacade tradeFacade;

    @PostMapping
    public ResponseEntity<TradesServiceDto> save(@RequestBody TradesServiceDto tradesServiceDto) {
        log.info("Init process");
        return new ResponseEntity<>(tradeFacade.save(tradesServiceDto), HttpStatus.OK);
    }
}
