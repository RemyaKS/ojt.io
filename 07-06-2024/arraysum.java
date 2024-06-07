public class arraysum {
    public static void main(String[] args) {
        int num[] = {2, 4, 5, 6};
        int sum = 0;
        for(int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Sum: " + sum);
    }
}
