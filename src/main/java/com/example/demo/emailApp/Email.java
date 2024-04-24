package com.example.demo.emailApp;


import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;

    private String password;

    private String email;
    private String department;

    private String alternateMail;


    private int mailBoxCapacity;

    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method to set the department - return the department;
        this.department = setDepartment();
        this.password = setPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
        //Call a method that returns a random password

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your generate email is : " + email);
    }

    public String setDepartment() {
        System.out.println("Enter the Department\n1 for Sales\n2 for Development \n3 for Accounting \n0 for none");
        System.out.println("Enter you Department code");
        Scanner sc = new Scanner(System.in);
        int deptChoice = sc.nextInt();
        switch (deptChoice) {
            case 1:
                return "sales";
            case 2:
                return "devlopment";
            case 3:
                return "accounting";
            default:
                return "";
        }
    }

    private String setPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    public String getAlternateMail() {
        return this.alternateMail;
    }

    public void setAlternateMail(String altMail) {
        this.alternateMail = altMail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String showInfo() {
        return "Display Name :" + firstName + " " + lastName + "\n" +
                "Department Name : " + department + "\n" +
                "Email Address is :" + email;
    }
}
