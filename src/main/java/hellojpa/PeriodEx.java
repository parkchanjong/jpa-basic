package hellojpa;

import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class PeriodEx {

    private Date startDate;
    private Date endDate;

    public PeriodEx() {
    }

    public PeriodEx(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
