

/** 
Name: Thanadon Chutrakoon 
Date: 2/10/2026 
Class Section: MW
*/

/**
 this game is provide the menu to play game and calculate harry health
 */

import java.util.Scanner;

public class harry_potter {
    public static void main(String[] args) {
        Scanner skd = new Scanner(System.in);
        char Patronus_charm;
        int Health, Choice;
        final int Grindylow = 20, Troll = 40, Basilisk = 80, Dementor = 60;
        System.out.println("Harry Potter is Being attacked!");
        System.out.print("Enter your health(1-100): ");
        Health = skd.nextInt();
        while (Health > 100 || Health < 0) {
            System.out.print("Invalid value enter again");
            Health = skd.nextInt();
        }
        System.out.print("which creature is attacking? \n" + "1. Grindylow\n" +
                "2. Troll\n" +
                "3. Basilisk\n" +
                "4. Dementor\n");
        System.out.print("Enter you choice: ");
        Choice = skd.nextInt();
        switch (Choice) {
            case 1:
                System.out.print("Harry is attacked by a Grindylow which deals 20 damage. \n" + "Harry ends the battle with "
                                + (Health - Grindylow) + " Health\n");
                Health = Health - Grindylow;
                break;
            case 2:
                System.out.print("Harry is attacked by a Troll which deals 40 damage. \n" + "Harry ends the battle with "
                                + (Health - Troll) + " Health\n");
                Health = Health - Troll;
                break;
            case 3:
                System.out.print("Harry is attacked by a Basilisk which deals 80 damage. \n" + "Harry ends the battle with "
                                + (Health - Basilisk) + " Health\n");
                Health = Health - Basilisk;
                break;
            case 4:
                System.out.print("Has Harry learned the Patronus charm yet? y/n:");
                Patronus_charm = skd.next().charAt(0);
                if (Patronus_charm == 'Y' || Patronus_charm == 'y') {
                    System.out.println("Harry is attacked by a Dementor which deals 60 damage.\n"
                            + "Harry ends the battle with " + (Health - Dementor) + " health.");
                    Health = Health - Dementor;
                } else {
                    System.out.println("Harry suffers the Dementor's Kiss and... it's not pretty. Poor Harry.");
                    Health = 0;
                }

                break;
                
            default:
                break;
        }
        
        if (Choice >= 1 && Choice <= 4) {
            if (Health > 0) {
                System.out.println("Harry is still alive");
            }
            else {
                System.out.println("Harry has died");
            }
        }
        else {
            System.out.println("Sorry. " + Choice + " isn't a valid creature. Harry must not want to do battle today.");
        }

    }
}
