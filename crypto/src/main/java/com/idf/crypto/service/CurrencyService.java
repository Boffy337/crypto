package com.idf.crypto.service;

import com.idf.crypto.entity.Currency;
import com.idf.crypto.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }

    public List<Currency> findBySymbol(String symbol) {
        return currencyRepository.findBySymbol(symbol);
    }
}
