package ksu.coolbaba.domain;

import javax.persistence.*;


@Entity
@Table(name = "orgform")
public class OrgForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Integer ID;
    private   String FullName;

    @Column (name = "short_name")
    private  String ShortName;
    private  String EngFullName;
    private  String EngShortName;
    private  String note;
    private  TypeOfForm  typeOfForm;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String shortName) {
        ShortName = shortName;
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
}
