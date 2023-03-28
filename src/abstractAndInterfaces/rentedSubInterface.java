package abstractAndInterfaces;

public class rentedSubInterface implements paymentInterface{
    private int year;
    private String name;
    private double rate;
    private int days;

    public rentedSubInterface(int year, String name, double rate, int days)
    {
        this.year = year;
        this.name = name;
        this.rate = rate;
        this.days = days;
    }
    public double getRate()
    {
        return rate;
    }
    public void setRate(double rate)
    {
        this.rate = rate;
    }
    public int getDays()
    {
        return days;
    }
    public void setDays(int days)
    {
        this.days = days;
    }
    public double calculatePayment()
    {
        return rate * days;
    }
}
