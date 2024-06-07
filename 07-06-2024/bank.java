//Create a Java program that uses encapsulation to model a bank account. Ensure that the account balance cannot be directly
 //accessed and provide methods to deposit, withdraw, and check the balance.  

 class Account {
    private String name;
    private String acctId;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class bank {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Miya");
        obj.setAcctId("2020");
        System.out.println("Name: " + obj.getName());
        System.out.println("Account No: " + obj.getAcctId());
        
        obj.deposit(2000);
        System.out.println("Balance after deposit: " + obj.getBalance());
        
        obj.withdraw(1000);
        System.out.println("Balance after withdrawal: " + obj.getBalance());
    }
}
