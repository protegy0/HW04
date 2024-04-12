public class RegularCustomer extends Customer {
    public RegularCustomer(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }

    @Override
    public String payCoffee() {
        return "Regular customers can pay with Card";
    }
}
