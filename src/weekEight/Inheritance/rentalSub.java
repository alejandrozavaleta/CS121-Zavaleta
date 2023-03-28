package weekEight.Inheritance;

public class rentalSub extends carSuper {
        private double days;

        public rentalSub(int year, String name, double days)
        {
                super(year, name);
                this.days = days;
        }
        public double getDays()
        {
                return days;
        }
        public void setDays(double days)
        {
                this.days = days;
        }
        @Override
        public String toString(){
                return String.format("Name: %s%nYear: %d%nDays left: %.2f%n", getName(),getYear(),getDays());
        }

}