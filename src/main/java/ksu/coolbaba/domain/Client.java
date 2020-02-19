package ksu.coolbaba.domain;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")

public  class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Long ID;


    @Column (name = "DateOfReg")
    private  Date DateOfReg;


    @Column  (name = "DateOfEnd")
    private Date DateOfEnd;

    @Column(name="EDRPOW_INN")
    private  Long EDRPOW;



    @ManyToOne
  //  @Column(name = "OrgForm_id")
    @JoinColumn(name = "OrgForm_id")
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
    public Long getEDRPOW() {
        return EDRPOW;
    }
    public void setEDRPOW(Long EDRPOW) {
        this.EDRPOW = EDRPOW;
    }

    public OrgForm getOrgForm() {
        return orgForm;
    }
    public void setOrgForm(OrgForm orgForm) {
        this.orgForm = orgForm;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", DateOfReg=" + DateOfReg +
                ", DateOfEnd=" + DateOfEnd +
                ", EDRPOW=" + EDRPOW +
                ", orgForm=" + orgForm +
                '}';
    }
}



