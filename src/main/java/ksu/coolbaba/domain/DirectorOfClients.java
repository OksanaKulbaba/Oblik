package ksu.coolbaba.domain;

import javax.persistence.*;
import java.time.LocalDate;



@Table(name = "directorofclients")
public class DirectorOfClients  extends abstractClassDate{

   @OneToMany (mappedBy = "directorofclients")
   @JoinColumn (name ="contactFace_id")
    private   ContactFace contactFace;


    private  LocalDate DateOfReg;
    private  LocalDate DateOfEnds;


}
