/*
 * Task 1: Username Validator
Concepts: length(), contains(), startsWith(), endsWith()

Scenario: A website validates a username before allowing a user to register.

Requirements:
- Accept a username from the user.
- Check whether its length is at least 5 characters.
- Check whether it contains a space.
- Display whether the username is valid according to these rules.
Sample input: Arun123

Expected output:
Username: Arun123
Length: 7
Contains spaces: No
Username status: Valid*/
package stringdemo;

import java.util.Scanner;
public class UsernameValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        int length = username.length();
        boolean containsSpaces = username.contains(" ");

        System.out.println("Username: " + username);
        System.out.println("Length: " + length);
        System.out.println("Contains spaces: " + (containsSpaces ? "Yes" : "No"));

        if (length >= 5 && !containsSpaces) {
            System.out.println("Username status: Valid");
        } else {
            System.out.println("Username status: Invalid");
        }

	}

}
