package ksu.coolbaba.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "corpclient")
public class CorpClient  extends Client{

    private  String FullName;
    private  String ShortName;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Client client;

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

    public Client getClient() {
    return client;
}

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String getname() {
        return this.getShortName();
    }
}
