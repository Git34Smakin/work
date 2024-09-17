//user input
import java.util.Scanner;
public class exatwo {
    public static void main(String[] args) {
        Scanner sj =new Scanner(System.in);
        //ASKING FOR USERZ NAME
        System.out.println("ENTER YOUR NAME:");
        String name = sj.nextLine();
        //ASKING FOR USERZ AGE
        System.out.println("ENTER YOUR AGE");
        int age = sj.nextInt();
        //ASKING FOR USERZ FAVOURITE COLOR
        System.out.println("ENTER YOUR FAVOURITE COLOR");
        String color = sj.next();
        //ASKING FOR YOUR BEST EPL TEAM
        System.out.println("ENTER YOUR BEST EPL TEAM");
        String team = sj.next();
        //ASKING FOR USERZ FAVOURITE MOVIE
        System.out.println("ENTER YOUR FAVOURITE MOVIE ");
        String movie = sj.next();
        //PRINT OUT USERZ INFORMATION
        System.out.println("Your name is" +name+ ",you are" +age+ "years old");
        System.out.println("Your best EPL team is" +team);
        System.out.println("Your favourite color is" +color);
        System.out.println("Your favourite movie is"+movie);
        //closing the scanner
        sj.close();



    }
    
}
