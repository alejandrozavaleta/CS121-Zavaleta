package weekSeven.classArrayList;

import weekSeven.arrayList.stringArrayList;

import java.util.Scanner;

public class courseInfo
{
    public static void main(String[] args)
    {


        stringArrayList test = new stringArrayList();
        test.addYear(2016);
        test.addYear(2012);
        test.addYear(2006);

        System.out.printf("Years available:  %d elements.%n", test.getSize());
        test.displayYears1();

        System.out.printf("%nRemove first element: %d%n", test.getYear(0));
        test.removeYear(0);

        System.out.printf("%nYears available: %d elements.%n", test.getSize());
        test.displayYears2();

    }
}
