package twoSum;

import java.util.HashMap;

public class TwoSum {

	/**
	 * This function is used to find a target value which should be a summation 
	 * of two numbers from the given array of integers.
	 * @param listOfNums - Given array of integers.
	 * @param target - The sum of two integers from the given array should equal this value.
	 * @return The indices (position) of the two values from the given array that equals the target.
	 */
	public int[] searchForTarget(int[] listOfNums, int target) {
		int[] solution = new int[2];
		HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < listOfNums.length; i++) {
			if(seen.containsKey(target - listOfNums[i])) {
				solution[0] = seen.get(target - listOfNums[i]);
				solution[1] = i;
				break;
			}
			seen.put(listOfNums[i], i);
		}
		return solution;
	}

}
