/*
 * Task 2: Email Domain Extractor
Concepts: indexOf(), substring(), lastIndexOf()

Scenario: A college system needs to identify the domain of a student's email address.

Requirements:
- Accept an email address.
- Extract the text after @.
- Display the username and domain separately.
Sample input: arun@gmail.com

Expected output:
Username: arun
Domain: gmail.com*/
package stringdemo;
import java.util.Scanner;

public class EmailDomainExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        int atPosition = email.indexOf('@');
        int lastAtPosition = email.lastIndexOf('@');

        if (atPosition > 0 && atPosition == lastAtPosition
                && atPosition < email.length() - 1) {

            String username = email.substring(0, atPosition);
            String domain = email.substring(atPosition + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);

        } else {
            System.out.println("Invalid email address");
        }


	}

}
