// import java.lang.annotation.*;
// @Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.METHOD)
// @interface MyAnnotation{
//     String value();
// }
// public class customann {
//     @MyAnnotation("Custome Annotation")
//     public void annmethod(){
//         System.out.println("This is annotation method");
//     }
//     public static void main(String[] args){
//     customann obj = new customann();
//     obj.annmethod();
//     MyAnnotation ann=obj.getClass().getMethod("method annotation").getAnnotation
//     (MyAnnotation.Class);
//     System.out.println("Annotation Value :"+ann.value());
//     }

    
// }
import java.lang.reflect.Method;
 
@interface myannotation {
    String value();
}
 
public class customann {
    @myannotation("custom annotation")
    public void annmethod() {
        System.out.println("This is an annotated method");
    }
 
    public static void main(String[] args) throws Exception {
        customann obj = new customann();
        obj.annmethod();
        Method method = obj.getClass().getMethod("annmethod");
        myannotation ann = method.getAnnotation(myannotation.class);
        System.out.println("annotation value: " + ann.value());
    }
}