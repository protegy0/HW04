public class FilteredCoffee extends Coffee {
    private String brewType;

    FilteredCoffee(String name, Double price, String description, int calories, boolean active, String brewType) {
        super(name, price, description, calories, active);
        this.brewType = brewType;
    }

    public String getBrewType() {
        return brewType;
    }

    public void setBrewType(String brewType) {
        this.brewType = brewType;
    }
}
