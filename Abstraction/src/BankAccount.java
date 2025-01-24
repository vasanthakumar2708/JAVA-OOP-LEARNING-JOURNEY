/*
1. Banking System
Question:
Create an abstract class BankAccount with the following:

Abstract methods:
deposit(double amount)
withdraw(double amount)
Concrete methods:
showBalance(): Displays the current balance.
Create two subclasses:

SavingsAccount: Adds interest to the balance every month.
CurrentAccount: Deducts an overdraft fee if the balance goes below a certain limit.
Write a program to demonstrate the functionality of both account types.

Expected Output Example:
Savings Account:
Deposit: 1000
Balance after adding interest: 1100

Current Account:
Deposit: 500
Withdraw: 600
Overdraft fee applied. Balance: -120
 */



abstract class BankAccount {
    abstract int deposit(int depositAmount);
    abstract int withdraw(int withdrawAmount);

    void showbalance(String name,int amount){
        System.out.println(name+ " : "+amount);

    }

}

class SavingsAccount extends BankAccount{
    private int interest=100;
    private int balance;
    private int month;

    SavingsAccount(int balance,int month){

        this.balance=balance;
        this.month=month;
    }

    @Override
    int deposit(int depositAmount) {
        if(month>1){
            balance+=month*interest;
            balance+=depositAmount;
        }
        return depositAmount+balance;
    }

    @Override
    int withdraw(int withdrawAmount) {
        balance-=withdrawAmount;
        return balance;
    }
}

class CurrentAccount extends BankAccount{
    private int balance;
    private int overdraft_fee=100;

    CurrentAccount(int balance){
        this.balance=balance;
    }

    @Override
    int deposit(int depositAmount) {
        if(balance<500){
            balance-=overdraft_fee;
            System.out.println("Overdraft fee applied");
            return balance;
        }
        return depositAmount+balance;
    }

    @Override
    int withdraw(int withdrawAmount) {
        if(balance<500){
            balance-=overdraft_fee;
            System.out.println("Overdraft fee applied");
            return balance-withdrawAmount;
        }
        return balance-withdrawAmount;
    }
}

class account {
    public static void main(String[] args) {
        BankAccount b = new SavingsAccount(10000,2);
        int aferDepositSavings = b.deposit(1000);
        int afterWithDrawSavings = b.withdraw(2000);

        BankAccount b1 = new CurrentAccount(20000);

        int afterDepositCurrent = b1.deposit(100000);
        int afterWithDrawCurrent=b1.withdraw(2000);

        b.showbalance("AfterDepositSavings",aferDepositSavings);
        b.showbalance("AfterWithdrawSaving",afterWithDrawSavings);
        b.showbalance("AfterDepositCurrent",afterDepositCurrent);
        b.showbalance("AfterWithdrawCurrent",afterWithDrawCurrent);

    }
}
