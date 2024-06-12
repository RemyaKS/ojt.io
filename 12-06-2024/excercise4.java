class bankac{
    private String name;
    private String actid;
    private double balance=0;

    public String getName(){
        return name;
    }
    public String getactid(){
        return actid;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String newname){
        name = newname;
    }
    public void setactid(String newid){
        actid = newid;
    }
   

public void withdraw(double withdraw){
  
    if(balance > 0 && balance > withdraw){
        balance = balance - withdraw;
        System.out.println("Your withdrawal amount is : "+ withdraw);
    }
    else{
        System.out.println("No sufficient balance");
    }
    
}

public void deposit(double amount){
    balance = balance+amount;
}

   
}
public class excercise4 {
    public static void main(String[] args) {
        bankac obj = new bankac();
        obj.setName("Niha");
        obj.setactid("1212");
        
        System.out.println("Name : "+obj.getName());
        System.out.println("Account Id : "+obj.getactid());
       
        obj.deposit(5000);
      
        
        obj.withdraw(1000);
       
        System.out.println("Current Balance :"+obj.getBalance());

    }
    
}