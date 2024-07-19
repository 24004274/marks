
/**
 * Write a description of class studentMarks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class studentMarks{
    public static void main(String[]args){
    Scanner rams=new Scanner(System.in);
    System.out.println("Enter the marks");
    
    int mark=rams.nextInt();
    
    int level=0;
    
    if(mark <= 29){
       level=1;
    }
    else if(mark >= 30){
       level=2;
    }
    else if(mark>=40){
        level=3;
    }
    else if (mark >=50){
      level=4;
    }
    else if(mark >= 60){
      level=5;
    }
    else if(mark >= 70){
       level=6;
    }
    else if(mark >= 80){
        level=7;
    }

    System.out.println("the student level is: "+ level);
}
    
}