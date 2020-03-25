package ksu.coolbaba.domain;


import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account extends abstractClassDate {

    private String AccountNumber;
    private String Bank;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "client_ID")
    private Client client;
}
