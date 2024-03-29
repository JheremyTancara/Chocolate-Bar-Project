package project.greedy;

import java.util.Scanner;

/**
 * This Chocolate class contains methods to maximize the number of different sized pieces
 * of chocolate that can be obtained by breaking a chocolate bar into smaller pieces using
 * a greedy algorithm to solve this problem.
 *
 * @author Jheremy Kevin Tancara Zambrana
 */
public class Chocolate {

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
   * This method calculates the maximum number of pieces of chocolate that can be obtained by
   * breaking a chocolate bar into smaller pieces using a greedy algorithm.
   *
   * @param n The initial number of squares in the chocolate bar.
   * @return The maximum number of pieces of chocolate that can be obtained.
   */
  public static int maximizeChocolatePieces(int n) {
    int pieces = 1, i = n-1;
    while (i > pieces) {
      i -= ++pieces;
    }
    return pieces;
  }
}
