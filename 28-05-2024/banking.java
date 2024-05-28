// import java.util.Scanner;
// class banking{
//     public static void main(String[] args){
//         Scanner Scanner=new Scanner();
//         System.out.println("Account number");
//         String accno= int nextInt();
//         System.out.println("Account holder name");
//         String name=Scanner.nextLine();
//         System.out.println("balance");
//         int balance=new nextInt();
//     }
// }
public class banking {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public banking(String accountNumber, String accountHolderName, double initialBalance) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = initialBalance;
    }
public void deposit(double amount) {
    if (amount > 0) {
    balance += amount;
    System.out.println("Deposited " + amount + ". New balance is " + balance);
    } else {
    System.out.println("Deposit amount must be positive.");
    }
    }
    public void withdraw(double amount) {
    if (amount > 0) {
    if (balance >= amount) {
    balance -= amount;
    System.out.println("Withdrew " + amount + ". New balance is " + balance);
    } else {
    System.out.println("Insufficient balance.");
    }
    } else {
    System.out.println("Withdrawal amount must be positive.");
    }
    }
    public void checkBalance() {
    System.out.println("Current balance is " + balance);
    }
    public static void main(String[] args) {
    banking account = new banking("123456789", "Shreya", 5000);
    account.checkBalance();
    account.deposit(500);
    account.withdraw(200);
    account.withdraw(1500);
    account.checkBalance();
    }
   } 