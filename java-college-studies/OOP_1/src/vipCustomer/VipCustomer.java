package vipCustomer;

public class VipCustomer {
    String name;
    double creditLimit;
    String email;

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = "default@default.com";
    }

    public VipCustomer() {
        this.name = "Default Name";
        this.creditLimit = 0;
        this.email = "default@default.com";
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }
}
