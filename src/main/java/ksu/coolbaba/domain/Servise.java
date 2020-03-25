package ksu.coolbaba.domain;

import javax.persistence.*;


@Entity
@Table(name = "servise")
public class Servise extends abstractClassDate {

    private  String NameOfService;
    private   TypeOfService typeOfService;
}
