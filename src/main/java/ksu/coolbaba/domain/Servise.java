package ksu.coolbaba.domain;

import javax.persistence.*;


@Entity
@Table(name = "servise")
public class Servise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer ID;
    private  String NameOfService;
    private   TypeOfService typeOfService;
}
