/*
 * Name: Thanadon Chutrakoon 
 * Date: 2/21/2026 
 * Class Section: MW
 */

/**
 * This game is about harry potter and you need to escape from filch
 */

import java.util.Scanner;
import java.util.Random;

public class AdventureGame {
    public static void main(String[] args) {
        final int ALOHOMORA = 1, IMMOBULUS = 2, WINGARDIUM_LEVIOSA = 3;
        int filch = 5;
        Scanner skd = new Scanner(System.in);
        boolean problem = false;
        Random rnd = new Random();
        System.out.println("You are out past curfew and you hear Filch approaching.");
        System.out.println("It sounds like he is about 5 minutes away from finding you.");
        System.out.println("You need to get back to the common room before he catches you!");
        System.out.println("You run down the hall, turn right, and then suddenly stop");
        while (filch > 0 && problem == false) {
            System.out.println();
            System.out.println("There is a locked door ahead of you. You pull out your wand and\n" +
                    "yell...(press Enter)");

            skd.nextLine();
            int spell = rnd.nextInt(3) + 1;

            if (spell == ALOHOMORA) {
                System.out.println("Alohomora!");
                System.out.println("Well done! The door creaks open and you run through");

                problem = true;

            } else if (spell == IMMOBULUS) {
                System.out.println("Immobulus!");
                System.out.println("The door freezes in place, but it's still locked!");
                --filch;
            } else {
                System.out.println("Wingardium Leviosa!");
                System.out.println("The door doesn't budge. It's still locked.");
                --filch;
            }

            if (problem == false && filch > 0) {
                System.out.println("");
                System.out.println("You need to try a different spell!");
                System.out
                        .println("Oh no! Filch is getting closer! He sounds like he is " + filch + " minutes away.\n");
            }
            if (filch == 0) {
                System.out.println("");
                System.out.println(
                        "Filch grabs you by your collar. \"Aha! Out after curfew I see...detention for you!\"");
                System.out.println("Filch marches you to the headmaster's office while muttering about his");
                System.out.println("great ideas for your detention.");
                System.out.println("Game Over.");
                System.exit(0);

            }

        }
        System.out.println("");
        problem = false;
        System.out.println("That was close! You sprint down the hallway toward your common room.");
        System.out.println("As you near the potions classroom, you hear a loud crash.");
        System.out.println("A cloud of billiwigs erupts from the room. Their jar must have fallen off of the desk.");
        System.out.println("Sigh. You don't need this right now...you can't get stung!");
        System.out.println("");
        while (filch > 0 && problem == false) {
            System.out.println("There is a swarm of billiwigs ahead. You pull out your wand and\n" +
                    "yell...(press Enter)");

            skd.nextLine();
            int spell = rnd.nextInt(3) + 1;

            if (spell == ALOHOMORA) {
                System.out.println("Alohomora!");
                System.out.println("The billiwigs don't have locks! They keep buzzing!");
                --filch;
            } else if (spell == IMMOBULUS) {
                System.out.println("Immobulus!");
                System.out.println("Success! The billiwigs freeze in mid-air and drop to the floor.");
                problem = true;

            } else {
                System.out.println("Wingardium Leviosa!");
                System.out.println(
                        "That only caught one! You'd need to cast it a hundred more times to clear the room.");
                --filch;
            }
            if (problem == false && filch > 0) {
                System.out.println("");
                System.out.println("You need to try a different spell!");
                System.out
                        .println("Oh no! Filch is getting closer! He sounds like he is " + filch + " minutes away.\n");
            }
            if (filch == 0) {
                System.out.println("");
                System.out.println(
                        "Filch grabs you by your collar. \"Aha! Out after curfew I see...detention for you!\"");
                System.out.println("Filch marches you to the headmaster's office while muttering about his");
                System.out.println("great ideas for your detention.");
                System.out.println("Game Over.");
                System.exit(0);
            }
        }
        problem = false;
        System.out.println();
        System.out.println("You're almost there! The common room is right up the next stairwell.");
        System.out.println("You race to the bottom of the stairs and come face to face with a massive");
        System.out.println("pumpkin pasty blocking the stairs.");
        System.out.println("Looks like the Weasley twins have been trying out new pranks.");
        System.out.println();
        while (filch > 0 && problem == false) {
            System.out.println("There is a massive pumpkin pasty ahead. You pull out your wand and\n" +
                    "yell...(press Enter)");

            skd.nextLine();
            int spell = rnd.nextInt(3) + 1;

            if (spell == WINGARDIUM_LEVIOSA) {
                System.out.println("Wingardium Leviosa!");
                System.out.println("You wave your wand and the pumpkin pasty floats up in the air");
                System.out.println("You run under it and it falls back down");
                problem = true;

            } else if (spell == IMMOBULUS) {
                System.out.println("Immobulus!");
                System.out.println("The pumpkin pasty freezes solid, but it's still blocking your path!");
                --filch;

            } else {
                System.out.println("Alohomora!");
                System.out.println("The pumpkin pasty doesn't have a lock! It just sits there.");
                --filch;
            }

            if (problem == false && filch > 0) {
                System.out.println("");
                System.out.println("You need to try a different spell!");
                System.out
                        .println("Oh no! Filch is getting closer! He sounds like he is " + filch + " minutes away.\n");
            }
            if (filch == 0) {
                System.out.println("");
                System.out.println(
                        "Filch grabs you by your collar. \"Aha! Out after curfew I see...detention for you!\"");
                System.out.println("Filch marches you to the headmaster's office while muttering about his");
                System.out.println("great ideas for your detention.");
                System.out.println("Game Over.");
                System.exit(0);
            }
        }
        if (filch > 0) {
            System.out.println("");
            System.out.println("You reach the door of your common room and slip safely inside.");
            System.out.println("Filch is no match for a student of your ability!");
            System.out.println("You head to bed and for some reason dream of a chocolate frog the size of");
            System.out.println("a house.");
            System.out.println("Game over. You win!");
        }

    }

}
