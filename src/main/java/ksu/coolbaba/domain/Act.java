package ksu.coolbaba.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;


@Entity
@Table (name = "act")
public class Act extends abstractClassDate {

    private  String NumberOfAct;
    private  LocalDate DateAct;
    private LocalDate DateOfStart;
    private  LocalDate DataOfEnd;


    @OneToOne
    private Contract contract;


    @CollectionTable(name= "servise", joinColumns = @JoinColumn(name = "serviseOfContractID"))
    private  ArrayList<Servise> servises;



}
