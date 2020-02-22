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
    private  String numberOFContract;
    private Date DateOfRer;
    private  Date DateOfEnd;
    private  FormOfPay formOfPay;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;


    public String getNumberOFContract() {
        return numberOFContract;
    }

    public void setNumberOFContract(String numberOFContract) {
        this.numberOFContract = numberOFContract;
    }

    public Date getDateOfRer() {
        return DateOfRer;
    }

    public void setDateOfRer(Date dateOfRer) {
        DateOfRer = dateOfRer;
    }

    public Date getDateOfEnd() {
        return DateOfEnd;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        DateOfEnd = dateOfEnd;
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
