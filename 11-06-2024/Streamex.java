import java.util.*;
import java.util.stream.Collectors;
public class Streamex {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Summer", "Mansoon", "Autumn", "winter","Spring");
        List<String> fnames = names.stream().filter(name->name.startsWith("S")).collect(Collectors.toList());
        System.out.println("filtered names are :"+fnames);
        //sorting
        List<String> snames = names.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted names are :"+snames);
        //Mapping
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Upper case names are :"+upperCaseNames);
        //Mapping
        Map<Integer,List<String>> mobj=names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped names are :"+mobj);
}
}
