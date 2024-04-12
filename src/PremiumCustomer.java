public class PremiumCustomer extends Customer {
    PremiumCustomer(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }

    @Override
    public String payCoffee() {
        return "Premium customers can pay with Cash, Card, or BTC, all with a 10% discount";
    }


}
