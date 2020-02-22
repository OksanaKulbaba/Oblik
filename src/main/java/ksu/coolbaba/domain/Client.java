package ksu.coolbaba.domain;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "client")

public class Client extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Long ID;

    private  Date DateOfReg;
    private Date DateOfEnd;


    private  String EDRPOW;

    @ManyToOne
    @JoinColumn(name = "org_form_id")
    private  OrgForm orgForm;

    public Date getDateOfReg() {
        return DateOfReg;
    }
    public void setDateOfReg(Date dateOfReg) {
        DateOfReg = dateOfReg;
    }
    public Date getDateOfEnd() {
        return DateOfEnd;
    }
    public void setDateOfEnd(Date dateOfEnd) {
        DateOfEnd = dateOfEnd;
    }
    public String getEDRPOW() {
        return EDRPOW;
    }
    public void setEDRPOW(String EDRPOW) {
        this.EDRPOW = EDRPOW;
    }

    public OrgForm getOrgForm() {
        return orgForm;
    }
    public void setOrgForm(OrgForm orgForm) {
        this.orgForm = orgForm;
    }


}



