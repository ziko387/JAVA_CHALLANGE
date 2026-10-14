import java.util.Scanner;

public class BankDetails {
    private String accountNumber;
    private String customerName;
    double balance;

    public BankDetails(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void createUser(){
        Scanner input =new Scanner(System.in);

        System.out.println("\n welcome to your bank details\n");
        System.out.println("Please enter your account number: ");
        setAccountNumber(accountNumber=input.nextLine());
        System.out.println("Please enter your customer name: ");
        setCustomerName(customerName=input.nextLine());
        System.out.println("Please enter your balance: ");
        setBalance(balance=input.nextDouble());

    }

    public void deposit(double amount){
        try {
            if (amount > 0) {
                balance += amount;
                System.out.println("you have deposited " + amount + "your balance is: " + balance);
            } else if (amount <= 0) {
                System.out.println("you cannot deposit below zero please try again");

            } else {
                System.out.println("invalid output");
            }
        }catch (Exception e){
            System.out.println("invalid output"+e.getMessage());
        }
    }
    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                System.out.println("you cannot withdraw below zero please try again");

            } else if (amount>balance) {
                System.out.println("insufficient funds");

            }else {
                balance -= amount;
                System.out.println("you have withdrawn " + amount + "your balance is: " + balance);
            }

        }catch (Exception e){
            System.out.println("invalid output"+e.getMessage());
        }
    }
    public void obtainBalance(){
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        String accountValue=input.nextLine();

        if(accountValue.equals(accountNumber)){
            System.out.println("you have entered your balance is: " + balance);
        }else  {
            System.out.println("Account number do not match");
        }


    }
}

