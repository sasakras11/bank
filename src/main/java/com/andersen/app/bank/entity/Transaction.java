package com.andersen.app.bank.entity;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Transaction {

    private Integer id;

    private Card recipientCard;

    private Card senderCard;

    private Integer moneyAmount;
}
