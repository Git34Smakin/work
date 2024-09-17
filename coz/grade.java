import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        System.out.println("SMAKS GRADING PROGRAM");
        Scanner grader = new Scanner(System.in);
        int grade= 2;
        while (true) {
            System.out.println("ENTER MARKS(NUMBERS ONLY):");
            if(grader.hasNextInt()){
                grade= grader.nextInt();
                break;
            }
            else{
                System.out.println("INVALID INPUT PLIZ ENTER A NUMBER");
                grader.next();
            }
            
        }
        if (grade>90){
            System.out.println("EXCELLENT");
        }
        else if (grade>=80) {
            System.out.println("VERY GOOD");
            
        } 
        else if(grade>=70) {
            System.out.println("GOOD");

        }
        else if(grade>=60){
            System.out.println("MEDIUM");
        }
        else if(grade>=50){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        grader.close();

    }
}