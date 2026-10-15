import java.util.ArrayList;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
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

    public void createUser() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n welcome to your bank details\n");
        System.out.println("Please enter your account number: ");
        setAccountNumber(accountNumber = input.nextLine());
        System.out.println("Please enter your customer name: ");
        setCustomerName(customerName = input.nextLine());
        System.out.println("Please enter your balance: ");
        setBalance(balance = input.nextDouble());

    }

    public void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you wish to deposit from: ");
        double amount = input.nextDouble();
        try {
            if (amount > 0) {
                balance += amount;
                System.out.println("you have deposited " + amount + "your balance is: " + balance);
            } else if (amount <= 0) {
                System.out.println("you cannot deposit below zero please try again");

            } else {
                System.out.println("invalid output");
            }
        } catch (Exception e) {
            System.out.println("invalid output" + e.getMessage());
        }
    }

    public void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you wish to withdraw from: ");
        double amount = input.nextDouble();

        try {
            if (amount <= 0) {
                System.out.println("you cannot withdraw below zero please try again");

            } else if (amount > balance) {
                System.out.println("insufficient funds");

            } else {
                balance -= amount;
                System.out.println("you have withdrawn " + amount + "your balance is: " + balance);
            }

        } catch (Exception e) {
            System.out.println("invalid output" + e.getMessage());
        }
    }

    public void obtainBalance() {
//        Scanner input =new Scanner(System.in);
//        System.out.println("\nPlease enter your account number: ");
//        String accountValue=input.nextLine();
//
//        if(accountValue.equals(accountNumber)){
//            System.out.println("dear: "+customerName+" your balance is: " + balance);
//        }else  {
//            System.out.println("Account number do not match");
//        }
        System.out.println("dear" + customerName + "your balance is: " + balance);


    }

    public void displayDetails() {
//        Scanner input1 =new Scanner(System.in);
//        System.out.println("\nPlease enter your account number: ");
//         String accountValue1=input1.nextLine();
//         try {
//             if(accountValue1.equals(accountNumber)){
//                 System.out.println("\n===========USER DETAILS========");
//                 System.out.println("AccountNumber: "+accountNumber);
//                 System.out.println("CustomerName: "+customerName);
//                 System.out.println("Balance: "+balance);
//                 System.out.println("===================================");
//             }else{
//                 System.out.println("Account number do not match");
//             }
//
//         }catch(Exception e){
//             System.out.println("invalid output"+e.getMessage());
//         }
//
//
//    }
        System.out.println("\n===========USER DETAILS========");
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("CustomerName: " + customerName);
        System.out.println("Balance: " + balance);
        System.out.println("===================================");
    }
}
    class main {
        public static void main(String[] args) {
            boolean SystemActive = true;
            Scanner input = new Scanner(System.in);
            ArrayList<BankDetails> bankMembers = new ArrayList<>();

            do {
                System.out.println("\nWelcome to your bank details\n");
                System.out.println("1.create account");
                System.out.println("2.deposit account");
                System.out.println("3.withdraw account");
                System.out.println("4.display balance");
                System.out.println("5.display Details");
                System.out.println("6.exit");
                System.out.println("Enter your choice: ");


                int choice = input.nextInt();
                input.nextLine();

                if (choice == 1) {
                    BankDetails bankDetails = new BankDetails("", "", 0.0);
                    bankDetails.createUser();
                    bankMembers.add(bankDetails);
                } else if (choice == 2) {
                    System.out.println("Enter account number:");
                    String accountNumber = input.nextLine();

                    BankDetails selectedValue = null;

                    for (BankDetails member : bankMembers) {
                        if (member.getAccountNumber().equals(accountNumber)) {
                            selectedValue = member;
                            break;
                        }
                    }

                    if (selectedValue != null) {
                        selectedValue.deposit();
                    } else {
                        System.out.println("Account not found.");
                    }

                } else if (choice == 3) {
                    System.out.println("Enter account number:");
                    String accountNumber = input.nextLine();
                    BankDetails selectedValue = null;

                    for (BankDetails members : bankMembers) {
                        if (members.getAccountNumber().equals(accountNumber)) {
                            selectedValue = members;
                            break;
                        }
                    }
                    if (selectedValue != null) {
                        selectedValue.withdraw();
                    } else {
                        System.out.println("Account number not found");
                    }
                } else if (choice == 4) {
                    System.out.println("Enter account number: ");
                    String accountNumber = input.nextLine();
                    BankDetails selectedValue = null;

                    for (BankDetails members : bankMembers) {
                        if (members.getAccountNumber().equals(accountNumber)) {
                            selectedValue = members;
                            break;
                        }
                    }
                    if (selectedValue != null) {
                        selectedValue.obtainBalance();
                    } else {
                        System.out.println("Account number not found");
                    }
                } else if (choice == 5) {
//                    System.out.println("Enter account number:");
//                    String accountNumber = input.nextLine();
//
//                    for (BankDetails bankMember : bankMembers) {
//                        if (bankMember.getAccountNumber().equals(accountNumber)) {
//                            bankMember.displayDetails();
//                        }
//                    }
                    System.out.println("Enter account number:");
                    String accountNumber = input.nextLine();

                    BankDetails selectedValue = null;

                    for (BankDetails member : bankMembers) {
                        if (member.getAccountNumber().equals(accountNumber)) {
                            selectedValue = member;
                            break;
                        }
                    }

                    if (selectedValue != null) {
                        selectedValue.displayDetails();
                    } else {
                        System.out.println("Account not found.");
                    }
                } else if (choice == 6) {
                    System.out.println("goodbye and welcome back again");
                    SystemActive = false;
                    // System.exit(0);
                }


            } while (SystemActive);

            System.out.println(" Banking system closed.");
            input.close();
        }
    }


