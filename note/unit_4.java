import java.util.Scanner; 
public class unit_4 
{
    public static void main(String[] args) {
        char  variable; 
        Scanner skb = new Scanner(System.in); 
         /*System.out.print("Put a number between 5-10 ");
        a = skb.nextInt();
        while(a > 10 || a <  5 ){
            System.out.println("Invalid number enter again");
            a = skb.nextInt();

        } 
        System.out.println("valid value :" + a++); 
        System.out.println("now enter Y or N");
        variable = skb.nextLine().charAt(0);
        while(variable != 'Y' && variable !='N') 
        { System.out.println("enter invlaid variabel try again: ");
            variable = skb.nextLine().charAt(0);
        }
        System.out.println("valid valueable: ");  */ 

        for(int a = 8; a <13 ; a++)
        {
            System.out.println(a); 
        }
         for(int H =10; H > 0 ; H--)
        {
            System.out.print(H + " "); 
        }
        System.err.println(" ");
        for(int L = 100; L >-1 ; L -= 7)
        {
        System.out.print(L + " ");
        }
        System.out.println(" "); 
        for(int K = 100; K > 0  ; K--)
        { if(K % 6 == 0 || K % 8 == 0)
            System.out.print(K + " "); 
        }
    }

    
}
