package arraydemo;
 import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6};
		System.out.println(arr[3]); // 4
		//System.out.println(arr[13]); //ArrayIndexOutOfBoundsException
		
		
		int ar[]=new int[14];
		ar[0]=100;
		System.out.println(ar[0]); //100
		System.out.println(ar[3]);  //0
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		String intArrayString = Arrays.toString(intArray);
		 
		// print directly will print reference value
		System.out.println(intArray);
		// [I@7150bd4d
		 
		System.out.println(intArrayString);
		// [1, 2, 3, 4, 5]

		//Check if an array contains a certain value
		String[] stringArray = { "abc", "bcd", "cba", "dcb", "efg" };

		boolean b = Arrays.asList(stringArray).contains("abc");
		System.out.println(b);
		// true

		//Concatenate two arrays

		int[] intArray1 = { 1, 2, 3, 4, 5 };
		int[] intArray2 = { 6, 7, 8, 9, 10 };
		// Apache Commons Lang library
		int a[] = ArrayUtils.addAll(intArray1, intArray2);

		String s = Arrays.toString(a);

		System.out.println(s);

		//1,2,3,4,5,6,7,8,9,10

		
		String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
		System.out.println(j);
		
		//reverse the array
		int[] intArray3 = { 1, 2, 3, 4, 5 };
		ArrayUtils.reverse(intArray3);
		System.out.println(Arrays.toString(intArray3));
		//[5, 4, 3, 2, 1]
		
		//Remove on the element
		int[] intArray4 = { 1, 2, 3, 4, 5 };
		int[] removed = ArrayUtils.removeElement(intArray4, 3);//create a new array
		System.out.println(Arrays.toString(removed));




	}

}
