package abstractAndInterfaces;

public class leasedSubInterface implements paymentInterface{
    private int year;
    private String name;
    private double total;

    public leasedSubInterface(int year, String name, double total){

        this.year = year;
        this.name = name;
        this.total = total;
    }

    public double getTotal()
    {
        return total;
    }
    public void getTotal(double total)
    {
        this.total = total;
    }

    public double calculatePayment()
    {
        return total/48;
    }
}
