package ksu.coolbaba.domain;

import javax.persistence.*;

@Entity
@Table(name = "clientperson")
@PrimaryKeyJoinColumn(name = "client")
public class PersonClient  extends Client{

    private  String FirstName;
    private  String SecondName;
    private  String MiddleName;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Client client;

}

