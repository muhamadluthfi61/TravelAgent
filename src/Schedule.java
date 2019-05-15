import java.util.GregorianCalendar;
import java.util.Calendar;

public class Schedule {
    private GregorianCalendar depature;
    private GregorianCalendar arrival;

    public Schedule(int depatureYear, int depatureMonth, int depatureDay, int depatureHour, int depatureMinute, int arrivalHour, int arrivalMinute) {
        this.depature = new GregorianCalendar(depatureYear, depatureMonth, depatureDay, depatureHour, depatureMinute);
        this.arrival = new GregorianCalendar();
        this.arrival = (GregorianCalendar) depature.clone();
        this.arrival.add((GregorianCalendar.MINUTE), arrivalMinute);
        this.arrival.add((GregorianCalendar.HOUR), arrivalHour);
    }

    public GregorianCalendar getDepature() {
        return depature;
    }

    public GregorianCalendar getArrival() {
        return arrival;
    }

    public int getDepatureYear() {
        return depature.get(Calendar.YEAR);
    }

    public int getDepatureMonth() {
        return depature.get(Calendar.MONTH);
    }

    public int getDepatureDate() {
        return depature.get(Calendar.DATE);
    }

    public int getDepatureHour() {
        return depature.get(Calendar.HOUR);
    }

    public int getDepatureMinute() {
        return depature.get(Calendar.MINUTE);
    }

    public int getArrivalYear() {
        return arrival.get(Calendar.YEAR);
    }

    public int getArrivalMonth() {
        return arrival.get(Calendar.MONTH);
    }

    public int getArrivalDate() {
        return arrival.get(Calendar.DATE);
    }

    public int getArrivalHour() {
        return arrival.get(Calendar.HOUR);
    }

    public int getArrivalMinute() {
        return arrival.get(Calendar.MINUTE);
    }
}
