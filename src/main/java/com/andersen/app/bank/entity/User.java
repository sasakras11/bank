package com.andersen.app.bank.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Length(min = 2, max = 20)
    @Column(name = "first_name")
    private String firstName;

    @Length(min = 2, max = 20)
    @Column(name = "last_name")
    private String lastName;

    @Length(min = 10, max = 50)
    @Column(name = "email")
    private  String email;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL)
    private List<Card> cards;

}
