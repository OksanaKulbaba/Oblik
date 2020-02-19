package ksu.coolbaba.domain;


import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String AccountNumber;
    private String Bank;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "client_ID")
    private Client client;
}
