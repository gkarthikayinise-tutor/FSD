package arraydemo;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={-56,-34,-25,46,78,96};
		int index=Arrays.binarySearch(arr,-25);
		System.out.println("Index :"+index);
		
		int index1=Arrays.binarySearch(arr,-255);
		System.out.println("Index :"+index1);
		
	}

}
