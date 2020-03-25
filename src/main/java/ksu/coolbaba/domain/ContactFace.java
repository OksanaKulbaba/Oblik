package ksu.coolbaba.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "contactface")
public class ContactFace extends abstractEntity {

    private   String FirstName;
    private   String SecondName;
    private  String MiddleName;
    private  String HisPosition;
    private  String Telephone;
    private  String Email;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Client client;
}
