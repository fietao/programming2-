import java.util.Scanner;

public class Chapter_5 
    /*public static void main(String[] args) {
        Scanner skd = new Scanner(System.in);
        int choice;
        System.out.println("Pick a number ");
        choice = skd.nextInt();
        System.err.println(choice + " tripled is " + (choice * 3));
        System.out.println("now let's print some cubes");
        tripled(choice);
    }

    public static void tripled(int value) {
        System.out.println(value + " tripled is " + (value * 3));
        for (int i = 1; i <= value; i++) {
            System.out.println(i + " cubed is " + (i * i * i));
        }
    }
}*/ 
{
public static void main(String[] args) {
        Scanner Skb = new Scanner(System.in);

    System.out.println("Enter a prime value");
    int prime = Skb.nextInt();

    boolean Prime;
    if (prime % prime == 0 && prime > 1) {
        Prime = true;
    } 
    else {
        Prime = false;
    }
    System.out.println("Is prime: " + Prime);
}

}

