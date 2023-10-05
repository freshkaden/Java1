import java.util.Scanner;
import package1.Student;

public class grader {
    public static void main(String[] args) throws Exception {
        float grade;
        char letter = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a grade between 0 and 100");
        grade = scanner.nextFloat();
        while (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100. Please input again");
            grade = scanner.nextFloat();

        }
        scanner.close();
        
        if (grade >= 90 && grade <= 100){
            letter = ('A');
        }
        else if (grade >= 80 && grade < 90){
            letter = ('B');
        }
        else if (grade >= 70 && grade < 80){
            letter = ('C');
        }
        else if (grade >= 60 && grade < 70){
            letter = ('D');
        }
        else if (grade >= 0 && grade < 60){
            letter = ('F');
        }
        /*
         * Write your code to convert grade to letter
         * If 90 <= grade <= 100, then letter = 'A'
         * If 80 <= grade < 90, then letter = 'B'
         * If 70 <= grade < 80, then letter = 'C'
         * If 60 <= grade < 70, then letter = 'D'
         * If 0 <= grade < 60, then letter = 'F'
         */


        System.out.println("Grade = " + grade);
        System.out.println("Letter = " + letter);  
    }
}

