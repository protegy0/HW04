public class Espresso extends Coffee {
    private String variety;
    private int numOfShots;
    private String milkType;
    private Boolean hasChocolate;
    private Boolean hasWhippedCream;
    private Boolean hasCinnamon;
    private Boolean hasSugar;

    Espresso(String name, Double price, String description, int calories, String variety, int numOfShots,
             String milkType, Boolean hasChocolate, Boolean hasWhippedCream, Boolean hasCinnamon, Boolean hasSugar) {
        super(name, price, description, calories);
        this.variety = variety;
        this.numOfShots = numOfShots;
        this.milkType = milkType;
        this.hasChocolate = hasChocolate;
        this.hasWhippedCream = hasWhippedCream;
        this.hasCinnamon = hasCinnamon;
        this.hasSugar = hasSugar;
    }

    public Boolean getHasSugar() {
        return hasSugar;
    }

    public void setHasSugar(Boolean hasSugar) {
        this.hasSugar = hasSugar;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getNumOfShots() {
        return numOfShots;
    }

    public void setNumOfShots(int numOfShots) {
        this.numOfShots = numOfShots;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public Boolean getHasChocolate() {
        return hasChocolate;
    }

    public void setHasChocolate(Boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
    }

    public Boolean getHasWhippedCream() {
        return hasWhippedCream;
    }

    public void setHasWhippedCream(Boolean hasWhippedCream) {
        this.hasWhippedCream = hasWhippedCream;
    }

    public Boolean getHasCinnamon() {
        return hasCinnamon;
    }

    public void setHasCinnamon(Boolean hasCinnamon) {
        this.hasCinnamon = hasCinnamon;
    }
}
