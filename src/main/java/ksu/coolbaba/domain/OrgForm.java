package ksu.coolbaba.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orgform")
public class OrgForm extends abstractEntity {

    private   String fullName;

    @Column (name = "short_name")
    private  String shortName;
    private  String EngFullName;
    private  String EngShortName;
    private  String note;
    private  TypeOfForm  typeOfForm;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getEngFullName() {
        return EngFullName;
    }

    public void setEngFullName(String engFullName) {
        EngFullName = engFullName;
    }

    public String getEngShortName() {
        return EngShortName;
    }

    public void setEngShortName(String engShortName) {
        EngShortName = engShortName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TypeOfForm getTypeOfForm() {
        return typeOfForm;
    }

    public void setTypeOfForm(TypeOfForm typeOfForm) {
        this.typeOfForm = typeOfForm;
    }

    @Override
    public Long getID() {
        return super.getID();
    }
}
