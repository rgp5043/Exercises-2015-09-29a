
import static java.time.Clock.system;
import java.util.Scanner;

/*
 * Repeatedly prompt the user to enter a grade.
 * 
 * The grade must be between 0 and 100; or it can be equal to -1.
 * Entering a -1 means the user has finished entering grades.
 * 
 * Output to the user
 * - How many grades the user entered
 * - The average of the grades
 * - Error messages when appropriate
 * 
 * Sample interaction:
 * 
 * Enter a grade: 70
 * Enter a grade: 75
 * Enter a grade: 101
 * Error. Grade must be between 0 and 100; or -1 to finish
 * Enter a grade: -1
 * 
 * You entered 2 grades. The average is 72.5
 */
public class Grades {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    
    int total = 0;
    
    int count = 0;
    /*
    *repeatedly prompt for grade
    */
    
    for (;;) {
    System.out.print("Enter a grade: ");
    int grade = keyboard.nextInt();
    if (grade >=0 && grade <=100) {
        total += grade;
        count++;
    } else if (grade != -1){
    System.out.println ("value out of range");
    }else{
        break;
    
    }
    total += grade;
  }
    System.out.println("Total is: " + total);
    System.out.println("average is: " + (float) total/count);
    }
  }
    

