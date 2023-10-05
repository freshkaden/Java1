import java.util.Scanner;

interface Print {
    void printMyName();
}

class Person implements Print {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void printMyName() {
        System.out.println(firstName + " " + lastName);
    }
}

class Student extends Person{
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
/* 
public class ClassDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(x:"input");
        int grade = sc.nextInt();
        while (grade < 0 || grade > 100) {
            System.out.println(i: "input again");
            grade = sc.nextInt();

        }
        sc.close();
        if (grade > 0)
            System.out.println(grade);
        
            System.out.println(grade+1);   
    }
    
}
*/

public class ClassDemo {
    public static void main(String[]args){
        Student student = new Student();
        student.setFirstName("Mike");
        student.setLastName("Brown");
    }
}