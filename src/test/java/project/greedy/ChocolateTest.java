package project.greedy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for the Chocolate class that use a greedy algorithm.
 */
class ChocolateTest {

  /**
   * This is a test method to verify the functionality of the maximizeChocolatePieces method.
   */
  @Test
  public void chocolateClassTest() {
    Assertions.assertEquals(1, Chocolate.maximizeChocolatePieces(1));
    Assertions.assertEquals(1, Chocolate.maximizeChocolatePieces(2));
    Assertions.assertEquals(2, Chocolate.maximizeChocolatePieces(3));
    Assertions.assertEquals(2, Chocolate.maximizeChocolatePieces(4));
    Assertions.assertEquals(2, Chocolate.maximizeChocolatePieces(5));
    Assertions.assertEquals(3, Chocolate.maximizeChocolatePieces(6));
    Assertions.assertEquals(3, Chocolate.maximizeChocolatePieces(7));
    Assertions.assertEquals(3, Chocolate.maximizeChocolatePieces(8));
    Assertions.assertEquals(3, Chocolate.maximizeChocolatePieces(9));
    Assertions.assertEquals(4, Chocolate.maximizeChocolatePieces(10));

    Assertions.assertEquals(5, Chocolate.maximizeChocolatePieces(15));
    Assertions.assertEquals(6, Chocolate.maximizeChocolatePieces(21));
    Assertions.assertEquals(7, Chocolate.maximizeChocolatePieces(28));
    Assertions.assertEquals(8, Chocolate.maximizeChocolatePieces(36));
    Assertions.assertEquals(9, Chocolate.maximizeChocolatePieces(45));
    Assertions.assertEquals(10, Chocolate.maximizeChocolatePieces(55));
  }
}
