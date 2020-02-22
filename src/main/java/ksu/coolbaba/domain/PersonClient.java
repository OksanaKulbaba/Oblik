package ksu.coolbaba.domain;

import javax.persistence.*;

@Entity
@Table(name = "clientperson")
public class PersonClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer ID;
    private  String FirstName;
    private  String SecondName;
    private  String MiddleName;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

}
