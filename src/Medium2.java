import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Medium2 {
    private JFrame mainFrame;
    private JLabel label;
    private JPanel controlPanel;
    private JPanel miniPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public Medium2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium2 medium2 = new Medium2();
        medium2.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3,3));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout()); //set the layout of the panel

//        miniPanel = new JPanel();
//        miniPanel.setLayout(new GridLayout(1,2)); //set the layout of the panel

        mainFrame.setVisible(true);
        label = new JLabel("label");
        label.setHorizontalAlignment(JLabel.CENTER);

    }

    private void showEventDemo() {

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");
        JButton button6 = new JButton("button 6");
        JButton button7 = new JButton("button 7");
        JButton button8 = new JButton("button 8");
        JButton button9 = new JButton("button 9");
        JButton button10 = new JButton("button 10");

//        miniPanel.add(label);
//        miniPanel.add(button9);
//        controlPanel.add(miniPanel);
        controlPanel.add(button9, BorderLayout.EAST);
        controlPanel.add(label, BorderLayout.CENTER);
        controlPanel.add(button10, BorderLayout.SOUTH);

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(controlPanel);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);
        mainFrame.setVisible(true);

    }

}
