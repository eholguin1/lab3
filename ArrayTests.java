import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {10,15};
    assertArrayEquals(new int[]{15,10}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input = {10 ,15, 20};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {20, 15, 10}, input);
  }

 }
