package com.idf.crypto.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "currentprice")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "symbol")
    @JsonProperty("symbol")
    private String symbol;
    @Column(name = "price")
    @JsonProperty("price_usd")
    private Integer price;

    public Currency(Long id, String symbol, Integer price) {
        this.id = id;
        this.symbol = symbol;
        this.price = price;
    }

    public Currency() {

    }
}
