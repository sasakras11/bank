package com.andersen.app.bank.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "exchange_rates")
public class ExchangeRates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "buy")
    private double buy;

    @Column(name = "sale")
    private double sale;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency")
    private Currency currency;
}
