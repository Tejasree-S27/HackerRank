import java.util.Scanner;

class UsernameValidator {
    /*
     * Username:
     * - Starts with an alphabet character
     * - Contains only letters, digits, and underscores
     * - Length must be between 8 and 30 characters
     */
    public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
