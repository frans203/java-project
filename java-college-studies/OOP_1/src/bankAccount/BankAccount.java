package bankAccount;

public class BankAccount {
    String accountNumber;
    double balance;
    String customerName;
    String email;
    String phoneNumber;

    public BankAccount() {
        this(
                "11111",
                2.5,
                "Default name",
                "default address",
                "32903923"); //very first line
    }


    public BankAccount(String number,
                       double balance,
                       String customerName,
                       String customerEmailAddress,
                       String customerPhoneNumber) {
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = customerEmailAddress;
        this.phoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 100.55, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double value) {
        this.balance = value;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String value) {
        this.customerName = value;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double incrementValue) {
        this.balance = this.balance + incrementValue;
        System.out.println("New balance: " + this.balance);
    }

    public void withdrawFunds(double decrementValue) {
        if (decrementValue <= this.balance) {
            this.balance = this.balance - decrementValue;
            System.out.println("New balance: " + this.balance);
        } else {
            System.out.println("Balance: " + this.balance + " withdraw not processed");
        }
    }
}
