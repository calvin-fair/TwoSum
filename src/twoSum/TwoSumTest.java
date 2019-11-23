package twoSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	/**
	 * This test is checking to see if the searchForTarget function is working correctly.
	 */
	@Test
	void test() {
		int[] testSet = {2, 7, 10, 5};
		int targetVal = 9;
		
		TwoSum test = new TwoSum();
		
		int[] result = test.searchForTarget(testSet, targetVal);
		int[] answer = {0,1};
		
		assertEquals(answer[0], result[0]);
		assertEquals(answer[1], result[1]);
	}

}
