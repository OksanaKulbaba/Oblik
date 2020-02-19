package ksu.coolbaba.domain;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Integer ID;
    private  String NumberOFContract;
    private Date DateOfRer;
    private  Date DateOfEnd;
    private  FormOfPay formOfPay;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
}
