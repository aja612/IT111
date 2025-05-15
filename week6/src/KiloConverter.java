import javax.swing.*;

public class KiloConverter extends JFrame  {

    JPanel panel;

    JLabel messageLabel;

    JTextField kiloTexField;

    JButton calcButton;
    final int WINDOW_WIDTH= 350;

    final int WINDOW_HEIGTH= 450;

//    always be aware of the colors that IntelliJ is using

//    create a construstor which is a special method to initialize our objects

    public KiloConverter() {

        setTitle("Kilometer Converter");

        setSize(WINDOW_WIDTH,WINDOW_HEIGTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();
        add(panel);
        setVisible(true);
    }

    public void buildPanel() {
        messageLabel = new JLabel("Enter a distance in kilometers");
//        text, button, panel

        kiloTexField = new JTextField( 10);

        calcButton = new JButton("calculate");

        panel = new JPanel();
//        we now have to add the above three components onto the JPanel

        panel.add(messageLabel);
        panel.add(kiloTexField);
        panel.add(calcButton);

    }

//    we have to add our main method
    public static void main(String[] args) {

        new KiloConverter();

    }
}
