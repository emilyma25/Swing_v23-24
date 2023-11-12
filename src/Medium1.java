import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Medium1 {
    private JFrame mainFrame;
    private JLabel label1;
    private JLabel label2;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public Medium1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium1 medium1 = new Medium1();
        medium1.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2,3)); //set the layout of the pannel

        mainFrame.add(controlPanel, BorderLayout.CENTER);
        mainFrame.setVisible(true);

        label1 = new JLabel("label 1");
        label1.setHorizontalAlignment(JLabel.CENTER);
        label2 = new JLabel("label 2");
        label1.setHorizontalAlignment(JLabel.CENTER);
    }

    private void showEventDemo() {

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");

        mainFrame.add(button1, BorderLayout.NORTH);
        controlPanel.add(button2);
        controlPanel.add(label1);
        controlPanel.add(button4);
        controlPanel.add(label2);
        controlPanel.add(button5);
        mainFrame.add(button3, BorderLayout.SOUTH);
        mainFrame.setVisible(true);

    }

}
