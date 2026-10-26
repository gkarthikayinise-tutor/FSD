package arraydemo;

import java.util.Arrays;
public class MaxminValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {45, 12, 78, 23, 9};

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);


	}

}
