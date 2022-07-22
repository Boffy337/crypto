package com.idf.crypto.repository;

import com.idf.crypto.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    List<Currency> findBySymbol(String symbol);
}
