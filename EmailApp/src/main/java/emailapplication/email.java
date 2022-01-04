package emailapplication;

import java.util.Locale;
import java.util.Scanner;

public class email {

    private String first_name;
    private String last_name;
    private String password;
    private String department;
    private String email;
    private int mailbox_capacity = 500;
    private String alternate_email;
    private String company_suffix = "company.com";
    private int def_pass_length = 10;

    public email(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
        System.out.println("Email Created :" + this.first_name + " - " + this.last_name);

        this.department = setDepartment();
        System.out.println("Department "+ this.department);


        this.password = random_pass(def_pass_length);
        System.out.println("Your password is :"+ this.password);

        email = first_name.toLowerCase() + last_name.toLowerCase() +"@"+ department +"."+ company_suffix;
        System.out.println("Your email is : "+ email);

    }

    private String setDepartment() {
        System.out.print("Enter the department\n1 for sales\n2 for Development\n3 for Accounting\n0 none \nEnter department code : ");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "accounting";
        } else {
            return "none";
        }
    }

//         Now let's generate a random password
        private String random_pass(int length) {
            String pass_set = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567890!@#";
            char[] password = new char[length];
            for (int i = 0; i < length; i++) {
                int random = (int) (Math.random() * pass_set.length());
                password[i] = pass_set.charAt(random);
            }
            return new String(password);
        }

        public void setMailboxCapacity(int capacity){
        this.mailbox_capacity = capacity;
        }

    public void setAlternate_email(String alternate_email) {
        this.alternate_email = alternate_email;
    }

    public void ChangePassword(String password){
        this.password = password;

    }
    public int getMailbox_capacity(){              // Accessor and Mutator functions
        return mailbox_capacity;                   // Encapsulation in other words
    }
    public String getAlternate_email(){
        return alternate_email;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo (){
        return "Display name is : " + first_name+ " "+ last_name +
                "\nCompany Email" + email +
                "\nMailbox Capacity :"+ mailbox_capacity +"mb";
    }

    // Constructor to receive the first name and last name

        // Ask for the department

        // Generate a random password

        // Set the mailbox capacity

        // Set the alternate email

        // Change the password
    }