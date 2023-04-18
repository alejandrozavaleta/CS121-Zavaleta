package Activity34;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class TotalCalories {
    private int caloriesPerDay;
    private String startDate;
    private String endDate;

    public TotalCalories(int caloriesPerDay, String startDate, String endDate) {
        this.caloriesPerDay = caloriesPerDay;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getCaloriesPerDay() {
        return caloriesPerDay;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int calculateTotalCalories() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date start = dateFormat.parse(startDate);
        Date end = dateFormat.parse(endDate);

        long diff = end.getTime() - start.getTime();
        int days = (int) (diff / (24 * 60 * 60 * 1000)) + 1;
        return days * caloriesPerDay;
    }
}