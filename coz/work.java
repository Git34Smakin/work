import java.util.Scanner;
public class work {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("enter your marks");
        int marks =sa.nextInt();
        switch (marks) {
            case 1:
            if(0<marks>49){System.out.println("fail");}
                
                break;
                case 2:
                if(50<marks<59){System.out.println("E");}
                break;
                case 3:


        
            default:
                break;
        }

    }
    
}
