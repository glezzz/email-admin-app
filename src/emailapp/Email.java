package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    // this is the name of the company that will be appended to the email address
    private String companySuffix = "amazon.com";
    private String email;
    private int mailboxCapacity;
    //need to define the length
    private int defaultPasswordLength = 8;
    private String alternateEmail;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        // 'this.firstName' refers to class level variable, 'firstName' refers to local variable
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // call a method asking for the department and return it
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method to generate random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combine elements to generate email in format firstname.lastname@department.company.com
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }
        //ask for department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES:\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for None\n Enter your department code:");
        //this is how we take input from the console
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) {
            return "Sales";

        } else if (depChoice == 2) {
            return "Dev";

        } else if (depChoice == 3) {
            return "Accounting";

        } else {
            return "";
        }
    }
        // generate a random password
    private String randomPassword(int length) {
        //characters password can be made out of
        String passwordSet = "abcdefghijklmnopqrstuvwxyz0123456789_&@!?#$%";
                //a new sequence of characters of the size "length"
        char[] password = new char[length];
        for ( int i = 0; i < length; i++) {
            //generate random number between 0 and 1 multiplied by however many characters in 'passwordSet', make that
            //an integer and store in randNum
            int randNum = (int) (Math.random() * passwordSet.length());
            //take the character at randNum in passwordSet and pass it to password array one at a time
            password[i] = passwordSet.charAt(randNum);
        }
        //because password is a set of characters we modify to new String
        return new String(password);
    }

    //set the mailbox capacity

    //set the alternate email

    //change the password
}
