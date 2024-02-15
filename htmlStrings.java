import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
     System.out.println("Enter Your first string :");
     String s1 = myObj.nextLine();
     
     
     System.out.println("Enter Your second string :");
    String s2 = myObj.nextLine(); 
    System.out.println( "<" + s2 + ">" + s1 + "</" + s2 + ">");

  
  }
}