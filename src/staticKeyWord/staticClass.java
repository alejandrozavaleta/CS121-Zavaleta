package staticKeyWord;

public class staticClass {
    private String name;
    private int Speed;
    private int qmi;


    public staticClass(String name, int Speed,int qmi)
    {
        this.name = name;
        this.Speed = Speed;
        this.qmi = qmi;
    }
    public String getName()
    {
        return name;
    }
    public int getSpeed()
    {
        return Speed;
    }
    public int getQmi()
    {
        return qmi;
    }
}
