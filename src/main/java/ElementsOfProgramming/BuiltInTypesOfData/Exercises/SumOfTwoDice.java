package ElementsOfProgramming.BuiltInTypesOfData.Exercises;

/**
 * Write a program SumOfTwoDice.java that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
 */

/**
 * SOLUTION
 * public class SumOfTwoDice {
 *     public static void main(String[] args) {
 *         int SIDES = 6;
 *         int a = 1 + (int) (Math.random() * SIDES);
 *         int b = 1 + (int) (Math.random() * SIDES);
 *         int sum = a + b;
 *         System.out.println(sum);
 *     }
 * }
 */
public class SumOfTwoDice {
    public static void main(String[] args) {
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        int rand1 = (int) (Math.random() * range) + min;
        int rand2 = (int) (Math.random() * range) + min;

        int sum = rand1 + rand2;

        System.out.println("First = " + rand1 + " Second = " + rand2);
        System.out.println("Sum = " + sum);
    }
}
