package ElementsOfProgramming.BuiltInTypesOfData.Exercises;

/**
 * Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 * /******************************************************************************
 *  *  Compilation:  javac Distance.java
 *  *  Execution:    java Distance x y
 *  *
 *  *  Prints the distance from (x, y) to the origin, where x and y
 *  *  are integers.
 *  *
 *  *  % java Distance 3 4
 *  *  distance from (3, 4) to (0, 0) = 5.0
 *  *
 *  *  % java Distance 5 12
 *  *  distance from (5, 12) to (0, 0) = 13.0
 *  *
 *  *  % java Distance 2 1
 *  *  distance from (2, 1) to (0, 0) = 2.23606797749979
 *  *
 *  ******************************************************************************
 *
 * my solution (wrong)
 *
 * import static java.lang.Math.abs;
 *
 * public class Distance {
 *     public static void main(String[] args) {
 *         int x = Integer.parseInt(args[0]);
 *         int y = Integer.parseInt(args[1]);
 *
 *         int distance_x = abs(x);
 *         int distance_y = abs(y);
 *
 *         System.out.println("Distance to the origin of x is: " + distance_x);
 *         System.out.println("Distance to the origin of y is: " + distance_y);
 *     }
 * }
 */

public class Distance {
    public static void main(String[] args) {

        // parse x- and y-coordinates from command-line arguments
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // compute distance to (0, 0)
        double dist = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

        System.out.println("Try it");
    }
}



