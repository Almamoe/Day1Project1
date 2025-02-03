import java.util.Scanner;

// create a program that will ask the users name, age, and reddit username. have it tell them the information back, in the format:
// your name is (blank), you are (blank) years old, and your username is (blank)
public class Day1 {
    public static void main (String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println(" What is your name? ");
        String name = scn.nextLine();

        System.out.println("How old are you? ");
        int age = scn.nextInt();
        scn.nextLine();


        System.out.println("What is your reddit username? ");
        String redditusername = scn.nextLine();



        System.out.println("your name is " + name + " you are " + age + "years old " + " and your reddit user name is " + redditusername );

    }
}
