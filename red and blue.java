/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.



seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
*/



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = str.nextLine();



        if (s1.startsWith("red")) {

            System.out.println("red");

        } else if (s1.startsWith("blue")) {
            System.out.println("blue");
        }
        else
        {
            System.out.println(" ");

       }}}
s