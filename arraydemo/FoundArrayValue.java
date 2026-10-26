/*
 * Question 2: Search for an Element in an Array
Scenario: A college administrator wants to check whether a particular student roll number exists in a list.

Task:
- Create an integer array containing 6 student roll numbers.
- Search for a given roll number using a loop.
- If the number exists, display its position; otherwise, display that it was not found.
Sample Input:
int[] rollNumbers = {101, 102, 103, 104, 105, 106};
int searchNumber = 104;


Expected Output:
Roll Number Found
Position: 4*/
package arraydemo;

public class FoundArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rollNumbers = {101, 102, 103, 104, 105, 106};
		int searchNumber = 104;
		int found=0;
		for(int i=0;i<rollNumbers.length;i++){
			if(rollNumbers[i]==searchNumber){
				System.out.println("Roll Number Found\nPosition:"+(i+1));
				found=1;
				break;
			}
		}
		if(found==0){
			System.out.println("Roll Number not Found");
		}
	}

}
