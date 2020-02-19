package ksu.coolbaba.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;


@Entity
@Table (name = "act")
public class Act {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Long ID;


    private  String NumberOfAct;
    private  LocalDate DateAct;
    private LocalDate DateOfStart;
    private  LocalDate DataOfEnd;

    @CollectionTable(name= "servise", joinColumns = @JoinColumn(name = "serviseOfContractID"))
    private  ArrayList<Servise> servises;

}
