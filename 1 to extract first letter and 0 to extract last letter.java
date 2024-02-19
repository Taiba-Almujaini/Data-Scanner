import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = str.nextLine();

        System.out.println("Enter 1 to extract first letter and 0 to extract last letter from the word: ");
        int option = str.nextInt();

        if(option==1 && word.length()>=1){
            String first = word.substring(0,1);
            System.out.println( first );
        }else if (option==0 && word.length()>=1)
        {
            String last = word.substring(word.length()-1);
            System.out.println( last );
        }else{
            System.out.println("Enter only 0 or 1");
        }




    }
}


