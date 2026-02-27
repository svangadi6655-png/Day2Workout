public class Bankaccount {
    String accountholder;
    double balance;
    void deposit(double bal){
        balance=balance+bal;
    }
    void withdraw(double bal){
        balance=balance-bal;
    }
    public static void main(String[] args){
        Bankaccount acc=new Bankaccount();
        acc.accountholder="shilpa";
        acc.balance=10000;
        acc.deposit(5000);
        acc.withdraw(3000);
        System.out.println("accountholder: "+acc.accountholder);
        System.out.println("balance: "+acc.balance);
    }
}
