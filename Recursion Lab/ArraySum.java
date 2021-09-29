/**
 * ArraySum class contains method for call from ArraySumDriver
 * method sumOfArray for calculating
 * the sum of Integers within an Array
 * respectively.
 * @author HuynhNgo
 */
public class ArraySum {

	private int result;

	public int sumOfArray(Integer[] myArray, int i) {
		//recursive method to calculate sum of an array
	     if (i == 0) { 
	         result = 0;
	     }
	     else {
	    	 result = myArray[i-1] + sumOfArray(myArray,(i-1));
	     }
	     return result;
	}
}