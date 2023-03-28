package weekEight.Inheritance;

public class carSuper {
    private int year;
    private String name;

    public carSuper(int year, String name)
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
}
