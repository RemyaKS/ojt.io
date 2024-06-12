class Encapsulatedclass{
    private String data;
    public String getDate(){
        return data;
    }
    public void setData(String data){
        this.data=data;
}
}
public class example3 {
    public static void main(String[] args){
        Encapsulatedclass obj = new Encapsulatedclass();
        obj.setData("Hello");
        System.out.println(obj.getDate());

    
}
}