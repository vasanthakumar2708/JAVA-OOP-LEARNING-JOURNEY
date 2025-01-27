/*
Question: Create a Bank Account Management System
Write a program to simulate a bank account using encapsulation. The program should include the following:

Class: BankAccount

Private attributes:
accountNumber (String)
accountHolderName (String)
balance (double)
Public methods:
Getters for all attributes.
Setters for accountHolderName (allowing updates to the name but not account number or balance directly).
deposit(double amount):
Add the specified amount to the balance if it’s positive.
Display an error if the amount is negative or zero.
withdraw(double amount):
Deduct the specified amount from the balance if there are sufficient funds.
Display an error if the amount exceeds the balance or is negative.
displayAccountDetails():
Print all account details (except sensitive information like account number).
Main Class: BankSystem

Create an object of BankAccount.
Initialize it with values for accountNumber, accountHolderName, and balance.
Use setter and getter methods to update the account holder's name.
Perform deposit and withdrawal operations and handle errors gracefully.
 */
class BankAccount {
    private String accountNumber;
    private String accountHolderName;

    private double balance;

    public String getAccountNumber(String accountNumber){
        return accountNumber;
    }
    public double getbalance(){
        return balance;
    }
    public String setaccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
        return accountHolderName;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public BankAccount(String accountHolderName, String accountNumber, double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displaydetails(){
        System.out.println("Person Details: ");
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }

    public void withdrawal(int amount){
        if(balance>amount){
            balance-=amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: "+balance);
        }
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("Deposit successful");
        System.out.println("Balance: "+balance);
    }

}
class Account {
    private String accountHolderNumber;

    public static void main(String[] args) {
        BankAccount account = new BankAccount("vasanth", "8473654", 10000);
        account.displaydetails();
        account.withdrawal(500);
        account.deposit(200);
        account.setaccountHolderName("sanjeevi");
        account.displaydetails();


    }
}

                            /*
                        Output:
                            Person Details:
                        Account Holder Name: vasanth
                        Account Number: 8473654
                        Balance: 10000.0
                        Withdrawal Successful
                        Remaining Balance: 9500.0
                        Deposit successful
                        Balance: 9700.0
                        Person Details:
                        Account Holder Name: sanjeevi
                        Account Number: 8473654
                        Balance: 9700.0
                             */

/*
Here by using Encapsulation, i created a class Bankaccount in that class i created methods related to the
bankaccount after that in the main function i called the respective functions.

In bankaccount class i only used get set method for accountholdername because we can't change the accountnumber
or balance, but we can change the accountholder name so that's why I didn't use get set method for accountnumber and
balance.

 */
