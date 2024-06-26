public class question9 {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        // Check if the first character of s matches the first character of p or if p's first character is '.'
        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
       // Handle the case where the second character of p is '*'
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }
    public static void main(String[] args) {
        question9 solution = new question9();
        System.out.println(solution.isMatch("aa", "a"));     
        System.out.println(solution.isMatch("aa", "aa"));     
        System.out.println(solution.isMatch("aaa", "aa"));    
        System.out.println(solution.isMatch("aa", "a*"));     
        System.out.println(solution.isMatch("aa", ".*"));    
        System.out.println(solution.isMatch("ab", ".*"));     
        System.out.println(solution.isMatch("aab", "c*a*b")); 
    }
}
