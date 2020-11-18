package com.andersen.app.bank.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Card {

    private String number;

    private User user;

    private String currency;

    private Integer moneyAmount;
}
