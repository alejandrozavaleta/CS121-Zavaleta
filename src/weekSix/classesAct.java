package weekSix;

public class classesAct {
    //variables
    String Model = "Civic";
    String Year = "2018";
    String Manufacturer = "Honda";

    //constructor
    public classesAct(String Model, String Year,String Manufacturer)
    {
        this.Model = Model;
        this.Year = Year;
        this.Manufacturer = Manufacturer;

    }

    void getCarInfo() {
        System.out.printf("Name: %s%nYear: %s%nManufacturer",Model,Year,Manufacturer);
    }
}