package Assignment2;

public class Account {
    int balance;
    public Account(){
        this.balance = 0;
    }
   public Account(int initialBalance){
        this.balance = initialBalance;
   }
   public void displayBalance(){
       System.out.println(this.balance);
   }
    public void withdraw(int amount){
        if(this.balance - amount < 0){
            System.out.println("This amount cannot be withdrawn");
        }else{
            this.balance -= amount;
        }
    }
    public void deposit(int amount){
        this.balance += amount;
    }
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.displayBalance();
        account1.deposit(100);
        account1.displayBalance();
        account1.withdraw(200);

    }
}
