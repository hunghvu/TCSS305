/*
 * TCSS 305 - Fall 2019
 * Assignment 0 - Orientation
 * This class contains main method
 */

/**
 * This program shows users author' hobbies.
 * @author Hung Huu Vu
 * @version 02 10 2019
 */
public class HobbiesMain
{
/**
 * Main method is used as testing environment for Hobbies class
 * and print out author' hobbies to test all the program setup.
 * @param args
 */
    public static void main(String[] args)
    {
        System.out.println("My hobbies are as below: ");
        Hobbies hobbies1 = new Hobbies("Building PC");
        System.out.println(hobbies1);
        hobbies1.changeHobbies("Exploring Hi-Fi audio world");
        System.out.println(hobbies1);
        System.out.println("Exploring hardware, smart devices in a technical viewpoint");
    }

}
