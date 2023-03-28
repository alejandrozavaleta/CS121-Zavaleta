package weekSeven.arrayList;

import java.util.ArrayList;

public class stringArrayList {

    private ArrayList<Integer> years = new ArrayList<>();
    private ArrayList<Character> produced = new ArrayList<>();
    private ArrayList<Double> engineSize = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();

    public void addYear(int year)
    {
        years.add(year);
    }
    public void removeYear(int year)
    {
        years.remove(year);
    }
    public int getYear(int index)
    {
        return years.get(index);
    }
    public int getSize()
    {
        return years.size();
    }
    public void displayYears1()
    {
        System.out.printf("Years:%n");
        for (Object year : years)
        {
            System.out.printf("%d%n", year);
        }
    }
    public void displayYears2()
    {
        System.out.printf("Years:%n");
        for (int i = 0; i < years.size(); i++)
        {
            System.out.printf("%d%n", years.get(i));
        }
    }
}
