import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Own{
    private JFrame mainFrame;

    private JLabel blank0;
    private JLabel blank1;
    private JLabel blank2;
    private JLabel blank3;
    private JLabel blank4;
    private JLabel blank5;
    private JLabel blank6;
    private JLabel blank7;
    private JLabel blank8;
    private JLabel blank9;
    private JLabel blank10;
    private JLabel blank11;
    private JLabel blank12;
    private JLabel blank13;
    private JLabel blank14;
    private JLabel blank15;
    private JLabel blank16;
    private JLabel blank17;
    private JLabel blank18;
    private JLabel blank19;
    private JLabel blank20;

    //private JPanel bottomStrip;
    //private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;


    public Own() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Own own = new Own();
        own.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(7, 5));

        //make labels
        blank1 = new JLabel(" ");
        blank1.setHorizontalAlignment(JLabel.CENTER);
        blank2 = new JLabel(" ");
        blank2.setHorizontalAlignment(JLabel.CENTER);
        blank3 = new JLabel(" ");
        blank3.setHorizontalAlignment(JLabel.CENTER);
        blank4 = new JLabel(" ");
        blank4.setHorizontalAlignment(JLabel.CENTER);
        blank5 = new JLabel(" ");
        blank5.setHorizontalAlignment(JLabel.CENTER);
        blank6 = new JLabel(" ");
        blank6.setHorizontalAlignment(JLabel.CENTER);
        blank7 = new JLabel(" ");
        blank7.setHorizontalAlignment(JLabel.CENTER);
        blank8 = new JLabel(" ");
        blank8.setHorizontalAlignment(JLabel.CENTER);
        blank9 = new JLabel(" ");
        blank9.setHorizontalAlignment(JLabel.CENTER);
        blank10 = new JLabel(" ");
        blank10.setHorizontalAlignment(JLabel.CENTER);
        blank11 = new JLabel(" ");
        blank11.setHorizontalAlignment(JLabel.CENTER);
        blank12 = new JLabel(" ");
        blank12.setHorizontalAlignment(JLabel.CENTER);
        blank13 = new JLabel(" ");
        blank13.setHorizontalAlignment(JLabel.CENTER);
        blank14 = new JLabel(" ");
        blank14.setHorizontalAlignment(JLabel.CENTER);
        blank15 = new JLabel(" ");
        blank15.setHorizontalAlignment(JLabel.CENTER);
        blank16 = new JLabel(" ");
        blank16.setHorizontalAlignment(JLabel.CENTER);
        blank17 = new JLabel(" ");
        blank17.setHorizontalAlignment(JLabel.CENTER);
        blank18 = new JLabel(" ");
        blank18.setHorizontalAlignment(JLabel.CENTER);
        blank19 = new JLabel(" ");
        blank19.setHorizontalAlignment(JLabel.CENTER);
        blank20 = new JLabel(" ");
        blank20.setHorizontalAlignment(JLabel.CENTER);


        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);
    }
    private void showEventDemo() {

        //make buttons
        JButton e1 = new JButton("e");
        JButton e2 = new JButton("e");
        JButton e3 = new JButton("e");
        JButton e4 = new JButton("e");
        JButton e5 = new JButton("e");
        JButton e6 = new JButton("e");
        JButton e7 = new JButton("e");
        JButton e8 = new JButton("e");
        JButton e9 = new JButton("e");
        JButton e10 = new JButton("e");

        //mainframe
        mainFrame.add(blank1);
        mainFrame.add(blank2);
        mainFrame.add(blank3);
        mainFrame.add(blank4);
        mainFrame.add(blank5);

        mainFrame.add(blank6);
        mainFrame.add(e1);
        mainFrame.add(e2);
        mainFrame.add(e3);
        mainFrame.add(blank7);

        mainFrame.add(blank8);
        mainFrame.add(e4);
        mainFrame.add(blank9);
        mainFrame.add(blank10);
        mainFrame.add(blank11);

        mainFrame.add(blank12);
        mainFrame.add(e5);
        mainFrame.add(e6);
        mainFrame.add(blank13);
        mainFrame.add(blank14);

        mainFrame.add(blank15);
        mainFrame.add(e7);
        mainFrame.add(blank16);
        mainFrame.add(blank17);
        mainFrame.add(blank18);

        mainFrame.add(blank19);
        mainFrame.add(e8);
        mainFrame.add(e9);
        mainFrame.add(e10);
        mainFrame.add(blank20);

        mainFrame.setVisible(true);
    }
}