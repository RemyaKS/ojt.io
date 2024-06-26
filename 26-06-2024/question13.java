public class question13 {
    public int[] twoSum(int[] numbers, int target) {
            int i = 0, j = numbers.length - 1;
    
            while (i < j) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    return new int[]{i + 1, j + 1};
                } else if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
             return null;
        }
    public static void main(String[] args) {
            question13 solution = new question13();
            int[] numbers = {2, 7, 11, 15};
            int target = 9;
            int[] result = solution.twoSum(numbers, target);
            if (result != null) {
                System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            } else {
                System.out.println("No solution found");
            }
        }
    }
    
    

