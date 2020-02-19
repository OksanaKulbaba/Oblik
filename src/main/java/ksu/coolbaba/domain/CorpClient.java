package ksu.coolbaba.domain;

import javax.persistence.*;


@Entity
@Table(name = "corpclient")
public class CorpClient  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer ID;
    private  String FullName;
    private  String ShortName;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client")
    private Client client;
}
