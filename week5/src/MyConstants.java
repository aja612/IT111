import java.sql.SQLOutput;
import java.util.Scanner;

public class MyConstants {

    public static void main(String[] args) {
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;

        int td, con, fg;

//        ask the end user to enter the touchdowns, con and fg

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of Touchdowns!");
        td = input.nextInt() * TOUCHDOWN;
        System.out.println("Please enter the number of Conversion!");
        con = input.nextInt() * CONVERSION;
        System.out.println("Please enter the number of FIELDGOAl!");
        fg = input.nextInt() * FIELDGOAL;

        System.out.println(td);
        System.out.println(con);
        System.out.println(fg);
        System.out.print("Our total score is");
        System.out.println(td + con + fg);




    }
}
