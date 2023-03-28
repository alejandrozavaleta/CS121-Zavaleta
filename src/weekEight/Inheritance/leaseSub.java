package weekEight.Inheritance;

public class leaseSub extends carSuper {
    private double months;

    public leaseSub(int year, String name, double months)
    {
        super(year, name);
        this.months = months;
    }
    public double getMonths()
    {
        return months;
    }
    public void setMonths(double months)
    {
        this.months = months;
    }
    @Override
    public String toString(){
        return String.format("Name: %s%nYear: %d%nMonths left: %.2f%n", getName(),getYear(),getMonths());
    }

}