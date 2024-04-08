public class FilteredCoffee extends Coffee {
    private String brewType;

    FilteredCoffee(String name, Double price, String description, int calories, String brewType) {
        super(name, price, description, calories);
        this.brewType = brewType;
    }

    public String getBrewType() {
        return brewType;
    }

    public void setBrewType(String brewType) {
        this.brewType = brewType;
    }
}
