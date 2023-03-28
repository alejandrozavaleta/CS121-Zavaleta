package abstractAndInterfaces;

public class rentedCarSub extends abstractClass
{
    private double rate;
    private int days;

    public rentedCarSub(int year, String name, double rate, int days){
        super(year, name);
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
    @Override
    public String toString()
    {
        return super.toString() + String.format("Rate: %.2f%nHours: %d%n",getRate(),getDays());
    }
    @Override
    public double calculatePayment()
    {
        return rate * days;
    }
}
