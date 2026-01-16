public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.deposit(1500);
        acc.withdraw(500);
        System.out.println(acc.getBalance());
    }
}

class BankAccount {
    // Private field (variable)
    private int balance;
    
    void deposit(int amount){
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(int amount){
        if (amount > 0) {
            balance -= amount;
        }
    }

    int getBalance(){
        return balance;
    }
}