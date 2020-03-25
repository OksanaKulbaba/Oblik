package ksu.coolbaba.domain;


import javax.persistence.MappedSuperclass;
import java.sql.Date;
import java.time.LocalDate;

@MappedSuperclass
public abstract class abstractClassDate extends abstractEntity {

    Date DataStart;
    Date DateEnd;

    public Date getDataStart() {
        return DataStart;
    }

    public void setDataStart(Date dataStart) {
        DataStart = dataStart;
    }

    public Date getDateEnd() {
        return DateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        DateEnd = dateEnd;
    }
}
