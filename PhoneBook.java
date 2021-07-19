package com.company;


import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    private String Name;
    private int PhoneNumber;
    Scanner in=new Scanner(System.in);
    HashMap<String,Integer> PhoneBook=new HashMap<>();
    public void getPhoneNumber() {
        boolean val=true;
        while (val) {
            System.out.println(
                            "1.ADD to Contacts" +
                            "\n2.Remove Contacts" +
                            "\n3.Display Contacts" +
                            "\n4.Dispaly FullContacts"+
                            "\n5.ToCheck"+
                            "\n6.ToUpadte"+
                            "\n7.Exit"

            );
            int choice;
            System.out.println("Enter Your Choice :");
            choice = in.nextInt();


            switch (choice) {
                case 1:
                    AddContact();
                    break;

                case 2:
                    RemoveContact();
                    break;

                case 3:
                    DisplayContact();
                    break;

                case 4:DisplayFullContact();
                    break;

                case 5:ToCheckTheNumber();
                break;

                case 6:ToUpdate();
                break;

                case 7:val=false;
                    System.out.println("Exiting.....");

            }
        }

    }

    private void ToUpdate() {
        String name;
        System.out.println("Enter The Name To Update");
        name=in.next();
        System.out.println("Enter the new Number ");
        int NewNumber;
        NewNumber=in.nextInt();
        PhoneBook.replace(name,NewNumber);
        System.out.println("updating.....");
        System.out.println(PhoneBook.get(name));
    }

    private void ToCheckTheNumber() {
        String name;
        System.out.println("Enter The Name To Check The Number In Your Contacts :");
        name=in.next();
        if(PhoneBook.containsKey(name)){
            System.out.println("The Number Present In the name is "+PhoneBook.get(name));
        }

    }



    private void DisplayFullContact() {
        System.out.println(PhoneBook);
    }

    private void DisplayContact() {

        System.out.println("Enter The Contact Name ");
        String ContactName=in.next();
        int ContactNumber=PhoneBook.get(ContactName);
        System.out.println("Contact Name :"+ContactName+
                "\nPhoneNumber :"+ContactNumber);
    }

    private void RemoveContact() {
        String Name;
        System.out.println("Enter The Name TO DELETE The Contact :");
        Name=in.next();
        PhoneBook.remove(Name);
        System.out.println("The Contact"+Name+"is Sucessfully Removed ");
    }

    private void AddContact() {
        System.out.println("Enter The Name : ");
        Name=in.next();
        System.out.println("Enter The Number To Add");
        PhoneNumber=in.nextInt();
        PhoneBook.put(Name,PhoneNumber);
        System.out.println("Contact Created SucessFully!");

    }

}

