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
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "receiver_card_id")
    private Card receiverCard;

    @ManyToOne
    @JoinColumn(name = "sender_card_id")
    private Card senderCard;

    @Column(name = "money_amount")
    private Integer moneyAmount;
}
