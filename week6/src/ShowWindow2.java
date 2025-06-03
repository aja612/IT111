
import javax.swing.*;

import java.awt.*;



public class ShowWindow2 {


    // private static Component background;

    public static void main(String[] args) {


        JFrame window = new JFrame();
        JTextField TextField1,TexField2;
        JLabel MyLabel1,MyLabel2;

        final int WINDOW_WIDTH = 650;
        final int WINDOW_HEIGHT = 400;



        window.setTitle("My Simple Window");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.getContentPane().setBackground(Color.red);
        window.setLocation(200, 200);


        window.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);


//        JLabel Mylabel1 = new JLabel();
        MyLabel1 = new JLabel("My First Big label");
        MyLabel1.setBounds(100, 60, 300, 20);
        MyLabel1.setFont(new Font("Arial", Font.PLAIN,14));
        TextField1 = new JTextField();
        TextField1.setBounds(100,200,300,40);
        window.add(MyLabel1);
        window.add(TextField1);

//        JLabel Mylabel2 = new JLabel();
        MyLabel2 = new JLabel("My Second Big label");
        MyLabel2.setBounds(100, 80, 100, 20);
        MyLabel2.setFont(new Font("Georgia", Font.BOLD,14));
        TexField2 = new JTextField();
        TexField2.setBounds(100,100,300,40);
        window.add(TexField2);
        window.add(MyLabel2);


        window.setVisible(true);

    }
}
