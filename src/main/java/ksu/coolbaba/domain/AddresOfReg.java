package ksu.coolbaba.domain;

import javax.persistence.*;
import java.sql.Date;



@Entity
@Table(name = "addresofreg")
public class AddresOfReg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer ID;
    private  Date DateOfReg;
    private Date DateOfEnd;
    private  Long PostIndex;
    private  String City;
    private  String District;
    private  String Street;
    private  String Build;
    private String Flat;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
}
