/*Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".



lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
*/



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = str.nextLine();


        if (s1.length()>=2) {
            String substring = s1.substring(0, s1.length() - 2);
            String lastTwoChars = s1.substring(s1.length() - 2);
            System.out.print( substring + lastTwoChars.charAt(1) + lastTwoChars.charAt(0));
           // System.out.print( substring + lastTwoChars);
        }
        else
            {
                System.out.print(s1);
            }

       }}
