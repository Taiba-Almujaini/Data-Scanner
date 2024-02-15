import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word = str.nextLine();
        System.out.println("Enter second word:");
        String word2 = str.nextLine();



        if (word.length() > 2 && word2.length() > 2 ) {
        String wSubstring = word.substring(1);
        String w2Substring = word2.substring(1);


        System.out.println(wSubstring+w2Substring);

            }
        else {
            System.out.println("please Enter words more than 2 character ");
        }

    }
}


