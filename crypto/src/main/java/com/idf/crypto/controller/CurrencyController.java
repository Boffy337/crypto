package com.idf.crypto.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.idf.crypto.entity.Currency;
import com.idf.crypto.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Level.WARNING;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Controller
public class CurrencyController {

    private static Logger log = Logger.getLogger(CurrencyController.class.getName());
    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/currency")
    public String findAll() {
        List<Currency> currencies = currencyService.findAll();
        return "currency-list";
    }

    @GetMapping("/currency/{symbol}")
    public String getPriceBySymbol() {
        return "";
    }

    @PostMapping("/currency/{symbol}")
    public String findBySymbol(@PathVariable("symbol") String symbol) {
        currencyService.findBySymbol(symbol);
        return "";
    }

    @GetMapping("/api.coinlore.net")
        public String jsonToJava(Currency currency) throws JsonProcessingException {
        String objectMapper = new ObjectMapper().writeValueAsString(currency);
        return "";
        }

    @GetMapping("/changes")
    public void changes(String symbol, Integer price) {
            // cant understand how to take info from DB for comparing
         log.warning("here should be warning about changing price >1%");
    }

}