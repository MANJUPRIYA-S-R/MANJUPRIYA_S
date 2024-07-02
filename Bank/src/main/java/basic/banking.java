package basic;
class Account {
    protected String accountNumber;
    protected double accountBalance;
    protected String accountHolder;

    public Account(String accountNumber, double accountBalance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountHolder='" + accountHolder + '\'' +
                '}';
    }
}

class DebitCard extends Account {
    private String cardNumber;
    private String cardPin;

    public DebitCard(String accountNumber, double accountBalance, String accountHolder, String cardNumber, String cardPin) {
        super(accountNumber, accountBalance, accountHolder);
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }

    public String withdraw(double amount, String enteredPin) {
        if (!enteredPin.equals(this.cardPin)) {
            return "Invalid PIN";
        }
        if (amount > this.getAccountBalance()) {
            return "Insufficient funds";
        }
        this.setAccountBalance(this.getAccountBalance() - amount);
        return "Withdrawal successful. New balance: " + this.getAccountBalance();
    }
}

class GPay extends Account {
    private String upiPin;
    private String username;

    public GPay(String accountNumber, double accountBalance, String accountHolder, String upiPin, String username) {
        super(accountNumber, accountBalance, accountHolder);
        this.upiPin = upiPin;
        this.username = username;
    }

    public String payBills(String billerName, double billedAmount, String billerType, String enteredUpiPin) {
        if (!enteredUpiPin.equals(this.upiPin)) {
            return "Invalid UPI PIN";
        }
        if (billedAmount > this.getAccountBalance()) {
            return "Insufficient funds";
        }
        this.setAccountBalance(this.getAccountBalance() - billedAmount);
        return "Bill paid to " + billerName + " (" + billerType + ") for " + billedAmount + ". New balance: " + this.getAccountBalance();
    }
}

public class banking {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard("123456", 5000, "John Doe", "1111-2222-3333-4444", "1234");
        GPay gpay = new GPay("123456", 5000, "John Doe", "5678", "john_doe");


        System.out.println(debitCard.withdraw(1000, "1234"));
        System.out.println(debitCard.withdraw(1000, "0000"));
        System.out.println(debitCard.withdraw(6000, "1234"));

        System.out.println(gpay.payBills("Electric Company", 500, "Electricity", "5678"));  // Correct UPI PIN
        System.out.println(gpay.payBills("Internet Provider", 1000, "Internet", "0000"));  // Incorrect UPI PIN
        System.out.println(gpay.payBills("Water Company", 6000, "Water", "5678"));  // Insufficient funds
    }
}