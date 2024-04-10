public class Coffee {
    private String name;
    private Double price;
    private String description;
    private int calories;
    private boolean active;

    Coffee(String name, Double price, String description, int calories, boolean active) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calories = calories;
        this.active = active;
    }
    public void prepare() {

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
