import java.util.ArrayList;

public abstract class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Coffee> orders = new ArrayList<>();

    Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public abstract String payCoffee();

    public void addOrder(Coffee order) {
        this.orders.add(order);
    }
    public void clearOrders() {
        this.orders.clear();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Coffee> getOrders() {
        return this.orders;
    }
}
