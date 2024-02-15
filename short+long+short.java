import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word = str.nextLine();
        System.out.println("Enter second word:");
        String word2 = str.nextLine();

        if (word.length()!=word2.length()){
            if (word.length()>word2.length()) {
                System.out.println(word2 + word + word2);
            }
            else
                {
                    System.out.println(word+word2+word);
                }

        }
        else {
            System.out.println("please enter 2 words with different length");
        }
        }

    }
