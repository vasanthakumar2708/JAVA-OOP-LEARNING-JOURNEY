class Account{
    private double balance;

    public double getBalance(){
        //write validation logic here
        return balance;
    }
}
public class DataHiding {
    public static void main(String[] args) {
        Account t=new Account();
        System.out.println(t.getBalance());
    }
}
/*
 *The process of hiding the data from direct access is called as data hiding.
 * The main advantage of data hiding is we can achieve security.
 * By using private modifier we can achieve data hiding.
 * here we are trying get balance directly so it gives compilation error.
 */


