import java.util.Scanner;

public class Triplet {
    
    // Method to triple the value
    public static int triplet(int value) {
        return value * 3;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.print("Enter a value: ");
        int userValue = scanner.nextInt();
        
        // Pass value to triplet method and print result
        int result = triplet(userValue);
        System.out.println("Tripled value: " + result);
        
        scanner.close();
    }
}
