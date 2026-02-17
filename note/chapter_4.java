
import java.util.Random;
import java.util.Scanner;
public class chapter_4 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 0; i <= 50; i +=2){
            sum += i;
        }
        System.out.println(sum); //print the sum of the odd number of the i that till number 50 
        //nested loop the loop inside of the loop
         int sum2 = 0; 
        for(int k = 0; k < 10;k++)
        { for(int L = 0; L < 5 ;L++)
        { sum2 += L ;  }    
        }
        System.out.println(sum2);
        System.out.println("In class patterns");
        for(int row = 1; row <=3; row++){
            for (int col = 1; col <=4; col++){
                System.out.print("*");
            }
            System.err.println();
        
                try(Scanner kbd = new Scanner(System.in)){
                    int userRow, Usercol;
                    char UserChar;
                    System.out.print("Enter rows followed by row: ");
                    userRow = kbd.nextInt();
                    System.out.print("Enter rows followed by col: ");
                    Usercol = kbd.nextInt();
                    System.out.print("Enter rows followed by Character: ");
                    kbd.nextLine();
                    UserChar = kbd.nextLine().charAt(0);
                    for(int Row = 1 ; Row <= userRow; Row++){
                        for(int Col = 1; Col <= Usercol; Col++){
                            if(Col == Row){
                                System.out.print(UserChar);
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
            }
                Random rnd = new Random();
        int n;
        int shift;
        n = kbd.next.Int;
                rnd.nextInt(n) + shift;
            }
        }