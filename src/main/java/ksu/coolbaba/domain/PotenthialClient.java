package ksu.coolbaba.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class PotenthialClient extends abstractEntity {

    private String email;
    private String telephone;
}
