import java.util.Scanner;

public class MyInput {

    public static void main(String[] args) {

        String name, message;
        int age;
        double salary;




        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your first name, please!");

        name = myobj.next();
        System.out.println(name=", please enter your age!");

        age = myobj.nextInt();

        System.out.println(name+", last, but not least, your annual salary!");

        salary = myobj.nextDouble();

        if (salary < 50000) {
            message = "I need another job, or a roomate";

        } else if (salary >= 50000 && salary < 60000) {
           message ="Not bad, but hard to survive in seattle";
        } else if (salary >= 60000 && salary < 70000) {
            message ="Salary is getting better";
        } else if (salary >= 70000 && salary < 80000) {
            message ="Almost livable in seattle";
        } else {
            message ="life is good";
        }


        System.out.println("First name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);
        System.out.println("message: " +message);

    }
}
