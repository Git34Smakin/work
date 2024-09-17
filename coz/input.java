import java.util.Scanner;

public class input{
    public static void main (String[]arg) {
        Scanner sc = new Scanner(System.in);
        //Asking for the user's name
        System.out.println("enter your name");
        String name= sc.nextLine();
        //Asking for the user's age
        System.out.println("How old are you?");
        int age= sc.nextInt();
        //print out the user's information
        System.out.println("MY NAME IS "+ name +"and I am "+age+" years old");
        sc.close();
    }
}