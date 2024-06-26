import java.util.HashMap;
public class question14 {
    private HashMap<Integer, Integer> elements = new HashMap<>();
    public void add(int number) {
        elements.put(number, elements.getOrDefault(number, 0) + 1);
    }
    public boolean find(int value) {
        for (int num : elements.keySet()) {
            int target = value - num;
            if (elements.containsKey(target)) {
                if (num != target || elements.get(target) > 1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        question14  twoSum = new question14 ();
        twoSum.add(1);
        twoSum.add(3);
        twoSum.add(5);
        System.out.println(twoSum.find(4));  
        System.out.println(twoSum.find(7));  
    }
}

    

