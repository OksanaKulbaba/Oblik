package ksu.coolbaba.domain;

import javax.persistence.*;


@Entity
@Table(name = "orgform")
public class OrgForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Integer ID;
    private   String FullName;
    private  String ShortName;
    private  String EngFullName;
    private  String EngShortName;
    private  String note;
    private  TypeOfForm  typeOfForm;
}
