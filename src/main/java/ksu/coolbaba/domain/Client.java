package ksu.coolbaba.domain;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Inheritance (strategy = InheritanceType.JOINED)
@Entity

public class Client  extends abstractClassDate {

    private  String EDRPOW;

    @ManyToOne
    @JoinColumn(name = "org_form_id")
    private  OrgForm orgForm;

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
    public String getname(){
        return "Name";
    };


}



