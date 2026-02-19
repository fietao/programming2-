public class Unit7 {
    public static void main(String[] args) {
        System.out.println("This unit the concept is all about array");
        System.out.println("array is a  data that primitive(stores simple value directly) types it is referrence data");
        System.out.println("array is requird to store the \r\n");
        System.out.println("3multiple value of the same type in a single variable");
        /*
         * double [] payrate = new double[25];
         * int [] numbers = new int[10];
         * //this code doube array referenced by the variable stored 25
         * for(int i = 0; i < payrate.length; i++){
         * payrate[i] = i+2;
         * }
         * System.out.println("Ussing array to string");
         * System.out.println(Arrays.toString(payrate));
         * for (int i = 5; i > 0; i--)
         * numbers[5 - i] = i * 2;
         * final int NUM_ROLLS = 7;
         * 
         * Random rnd = new Random();
         * int[] diceRolls = new int[NUM_ROLLS];
         * // primitive array create nums_rolls space
         * for (int i = 0; i < diceRolls.length; i++)
         * diceRolls[i] = rnd.nextInt(6) + 1;
         * // roll the die 1-6 and store the result in the array
         */

        for (int element : diceRolls) {
            System.out.println(element);
        }

    }
}