package es.cfuentes.code.test.kcomp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * K-Complementary checker
 *
 */
public class KComplementaryChecker {
	
    public static List<int[]> check (int[] array, int k) {
    	
    	LinkedList<int[]> ret = new LinkedList<int[]>();
    	
		// Stop condition. We need at least to elements for a pair 
		if(array.length < 2)
			return ret;

		// Base case. We check element at [0] against the rest of the list
		for(int i = 1; i < array.length; i++)
			if(array[0] + array[i] == k)
				ret.add(new int[] {array[0], array[i]});
		
		// Recuersive call to check the next values
		ret.addAll(check(Arrays.copyOfRange(array, 1 , array.length), k));
			
		return ret;
    }
}
