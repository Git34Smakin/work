import java.util.Scanner;
public class pass {
    public static void main(String[] args) {
        System.out.println("enter correct password");
        Scanner pa = new Scanner(System.in);
        String correctpass ="small20";
        int attempts=3;
        while (attempts==0) {
            System.out.println("enter your password");
            if(attempts=(correctpass)){
                System.out.println("SUCCESS..**");
            }
            else{
                System.out.println("wrong password");
            }
            else if(ättempts==3){
                System.out.println("account  blocked");
            }
            
        }

    }
    
}
