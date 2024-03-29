package project.dynamic.programming;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This Chocolate class contains methods to maximize the number of different sized pieces
 * of chocolate that can be obtained by breaking a chocolate bar into smaller pieces using
 * a dynamic programming algorithm to solve this problem.
 *
 * @author Jheremy Kevin Tancara Zambrana
 */
public class Chocolate {

  /**
   * This is the constructor of the Chocolate class
   */
  public Chocolate() {
  }

  /**
   * This method reads an integer from the standard input and prints the maximum number of pieces
   * of chocolate that can be obtained by breaking a chocolate bar into smaller pieces.
   *
   * @param args Command-line arguments (not used).
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    System.out.println(maximizeChocolatePieces(n));
  }

  /**
   * This method computes the maximum number of pieces of chocolate that can be obtained by
   * breaking a chocolate bar of length n.
   *
   * @param n The length of the chocolate bar.
   * @return The maximum number of pieces of chocolate that can be obtained.
   */
  public static int maximizeChocolatePieces(int n) {
    Set<Integer> coordinates = new HashSet<>();
    return breakChocolate(n, coordinates);
  }

  /**
   * This method recursively calculates the maximum number of pieces of chocolate that can be obtained
   * by breaking a chocolate bar of length n using dynamic programming.
   *
   * @param n The remaining length of the chocolate bar.
   * @param coordinates A set containing the sizes of chocolate pieces already used.
   * @return The maximum number of pieces of chocolate that can be obtained.
   */
  private static int breakChocolate(int n, Set<Integer> coordinates) {
    int maxPieces = 0;
    for (int size = 1; size <= n; size++) {
      if (!coordinates.contains(size)) {
        coordinates.add(size);
        maxPieces = Math.max(maxPieces, 1 + breakChocolate(n - size, coordinates));
        coordinates.remove(size); // backtrack
      }
    }

    return n == 0 ? 0 : maxPieces;
  }
}
