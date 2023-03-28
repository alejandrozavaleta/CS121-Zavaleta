package abstractAndInterfaces;

public abstract class abstractClass {

    private int year;
    private String name;

    public abstractClass(int year, String name)
    {
        this.year = year;
        this.name = name;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return String.format("Name: %s%nYear: %d%n",name, year);

    }
    public abstract double calculatePayment();
}
