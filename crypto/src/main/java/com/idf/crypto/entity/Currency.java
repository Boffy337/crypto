package com.idf.crypto.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "currentprice")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "symbol")
    private String symbol;
    @Column(name = "price")
    private Integer price;
    @Column(name = "updateTime")
    private Date updateTime;
}
