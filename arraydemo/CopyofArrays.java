package arraydemo;

import java.util.Arrays;

public class CopyofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks1[]={70,90,80};
		int marks2[]=Arrays.copyOf(marks1, 2);
		
		System.out.println(Arrays.toString(marks2));
	}
	

}
