package ksu.coolbaba.domain;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contract")
public class Contract extends abstractClassDate {

    private  String numberOFContract;

    private  FormOfPay formOfPay;

    @OneToOne
    private  Act actTest1;

    @OneToOne
    private  Act actTest2;



    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;


    public String getNumberOFContract() {
        return numberOFContract;
    }

    public void setNumberOFContract(String numberOFContract) {
        this.numberOFContract = numberOFContract;
    }


    public FormOfPay getFormOfPay() {
        return formOfPay;
    }

    public void setFormOfPay(FormOfPay formOfPay) {
        this.formOfPay = formOfPay;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


}
