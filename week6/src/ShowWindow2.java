import javax.swing.*;

public class ShowWindow2 {


        public static void main(String[] args) {

//        declare our variables
//        we are going to make them CONSTANTS

            final int WINDOW_WIDTH = 350;
            final int WINDOW_HEIGHT = 250;

//      Creat a window

            JFrame window = new JFrame();
//        Set the title
            window.setTitle("My Simple Window");

//        setting the size of our window
            window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

//        close the window and close the program

            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        display the window - if we do not display the window, it
//        displaying the window is a boolean
            window.setVisible(true);




        }
    }


