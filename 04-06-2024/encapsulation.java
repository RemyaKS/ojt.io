 class employee {
    private String name;
    private int age;
    public void setName(String newName){
        name =newName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void agenic(){
        age++;
    }
    // public void agenic(){
    //     age--;
    // }
    public int getAge(){
        return age;
    }
    }
    public class encapsulation{
        public static void main(String[] args) {
            employee empobj=new employee();
            empobj.setName("Remya");
            empobj.setAge(23);
            System.out.println("Employee name"+empobj.getName());
            System.out.println("Employee age"+empobj.getAge());
    }
}
    

