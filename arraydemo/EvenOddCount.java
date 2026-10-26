/*
 * Count Even and Odd Numbers
Scenario: A teacher has a list of student roll numbers and wants to count how many are even and how many are odd.

Task:
- Create an integer array containing 8 roll numbers.
- Count the even and odd numbers using a loop.
- Display both counts.
Sample Input:
int[] numbers = {12, 7, 24, 9, 15, 30, 18, 5};


Expected Output:
Even Numbers Count: 4
Odd Numbers Count: 4*/
package arraydemo;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {12, 7, 24, 9, 15, 30, 18, 5};
		int even=0,odd=0;
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		
		System.out.println("Even:"+even+"\nOdd:"+odd);

	}

}
