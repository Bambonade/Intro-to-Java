public class Record {
    private String food;
    private String mealType;
    private double calories;

    public Record(String food, String mealType, double calories) {
        this.food = food;
        this.mealType = mealType;
        this.calories = calories;
    }

    public String getfood() {
        return food;
    }

    public void setfood(String food) {
        this.food = food;
    }

    public String getmealType() {
        return mealType;
    }

    public void setmealType(String mealType) {
        this.mealType = mealType;
    }

    public double getcalories() {
        return calories;
    }

    public void setcalories(double calories) {
        this.calories = calories;
    }
}
