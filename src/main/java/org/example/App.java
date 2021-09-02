import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String password = "password123@";

        System.out.println( "What is your username?" );
        String user = input.next();
        System.out.println("What is your password? ");
        String user_password = input.next();

        if (password.equals(user_password)) {
            System.out.println("Welcome! ");
        }
        else {
            System.out.println("I don't know you");
        }

    }
}
