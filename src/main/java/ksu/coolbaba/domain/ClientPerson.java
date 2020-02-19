package ksu.coolbaba.domain;

import javax.persistence.*;

@Entity
@Table(name = "clientperson")
public class ClientPerson  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer ID;
    private  String FirstName;
    private  String SecondName;
    private  String MiddleName;


   @OneToOne (cascade = CascadeType.ALL)
   @JoinColumn(name = "id_client")
    private Client client;
}
