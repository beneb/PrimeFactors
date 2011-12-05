import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class PrimeFactorsTest {

	@Test
	public void testOne() {
		assertEquals(expectedList(), PrimeFactors.Create(1));
		
	}
	@Test
	public void testTwo() {
		assertEquals(expectedList(2), PrimeFactors.Create(2));
		
	}

	@Test
	public void testFour() {
		assertEquals(expectedList(2, 2), PrimeFactors.Create(4));
		
	}
	
	@Test
	public void testSix() {
		assertEquals(expectedList(2, 3), PrimeFactors.Create(6));
		
	}
	@Test
	public void testEight() {
		assertEquals(expectedList(2, 2, 2), PrimeFactors.Create(8));
		
	}
	@Test
	public void testNine() {
		assertEquals(expectedList(3,3), PrimeFactors.Create(9));
		
	}

	private List<Integer> expectedList(int... ints) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i : ints){
			result.add(i);
		}
		return result;
		
	}
}
