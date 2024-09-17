//user 3 attempts to input the correct password using a while loop
import java.util.Scanner;
public class exasix {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
        String correctpassword = "Smakin15";
         int attempts =3;
         while (attempts>0) {
            System.out.println("ENTER YOUR PASSWORD PLIZ***");
            String input = Scanner.nextLine();
            if(input.equals(correctpassword)){
                System.out.println("SUCCESSFUL!! PASSWORD -CORRECT");
            }
            else{
                attempts--;
                System.out.println("INCORRECT PASSWORD");
            }
            if(attempts==0){
                System.out.println("ACCOUNT BLOCKED");
            }
            
         }
         Scanner.close();

    }
}
