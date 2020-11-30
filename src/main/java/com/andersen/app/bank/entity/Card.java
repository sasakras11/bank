package com.andersen.app.bank.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "cards")
public class Card {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "number")
    private String number;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency")
    private Currency currency;

    @Column(name = "money_amount")
    private Integer moneyAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "receiverCard")
    List<Transaction> receive_transactions;

    @OneToMany(cascade = CascadeType.ALL,mappedBy ="senderCard")
    List<Transaction> send_transactions;
}
