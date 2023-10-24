import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 8, 2, 9, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 9, 2, 8, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 2, 3, 4, 4, 5};
    assertArrayEquals(new int[]{ 5, 4, 4, 3, 2 }, ArrayExamples.reversed(input1));
  }
}
