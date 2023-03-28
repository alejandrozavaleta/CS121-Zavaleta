package abstractAndInterfaces;

public class leasedCarSub extends abstractClass
{
    private double total;
    public leasedCarSub(double total, int year, String name)
    {
        super(year,name);
        this.total = total;
    }
    public double getTotal()
    {
        return total;
    }
    public void setTotal(double total)
    {
        this.total = total;
    }
    @Override
    public String toString()
    {
        return  String.format("Name: %s%nYear: %d%nTotal: %.2f%n",getName(),getYear(),getTotal());
    }
    @Override
    public double calculatePayment(){
        return total/48;
    }
}
