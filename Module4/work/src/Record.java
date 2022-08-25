public class Record {
    private String show;
    private String day;
    private double hours;



    public Record(String show, String day, double hours) {
        this.show = show;
        this.day = day;
        this.hours = hours;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
