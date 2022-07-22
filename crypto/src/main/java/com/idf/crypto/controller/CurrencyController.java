package com.idf.crypto.controller;

import com.idf.crypto.entity.Currency;
import com.idf.crypto.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CurrencyController {

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

}