
package mypackage;

public class Bank {
    private String accountNumber;
    private String customerName;
    private char accountType;
    private String balanceAmount;

    public Bank(String accountNumber, String customerName, char accountType, String balanceAmount) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.balanceAmount = balanceAmount;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance Amount: " + balanceAmount);
    }

    public void deposit(String amount) {
        double depositAmount = Double.parseDouble(amount);
        double currentBalance = Double.parseDouble(balanceAmount);
        double updatedBalance = currentBalance + depositAmount;
        balanceAmount = String.format("%.2f", updatedBalance);
    }

    public void withDraw(String amount) {
        double withdrawalAmount = Double.parseDouble(amount);
        double currentBalance = Double.parseDouble(balanceAmount);
        if (currentBalance - withdrawalAmount >= 5000) {
            double updatedBalance = currentBalance - withdrawalAmount;
            balanceAmount = String.format("%.2f", updatedBalance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

