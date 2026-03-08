/*The M5_CountFrequencyofElement class implements the program
 * that illustrates to finding the frequency of element and display the count
 * using for loop
 */
package Arrays;

public class M5_CountFrequencyOfElement {

	public static void main(String[] args) {
		int []arr = {10, 10, 10, 10, 20, 20, 20, 20, 40, 40, 50, 50, 30};
		int len = arr.length;
		boolean []freq = new boolean[len];
		for(int i=0; i<len; i++) {
			int count = 1;
			if(freq[i]==true)
				continue;
			for(int j=i+1; j<len; j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j] = true;
				}
			}
			System.out.println(arr[i]+" occurs "+count+" times");
		}
		
	}

}
