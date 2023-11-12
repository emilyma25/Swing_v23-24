import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Easy1{
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JLabel hello;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;

    public Easy1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        Easy1 easy1 = new Easy1();
        easy1.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 3));

//        //menu at top
//        cut = new JMenuItem("cut");
//        copy = new JMenuItem("copy");
//        paste = new JMenuItem("paste");
//        selectAll = new JMenuItem("selectAll");
//        cut.addActionListener(this);
//        copy.addActionListener(this);
//        paste.addActionListener(this);
//        selectAll.addActionListener(this);
//
//        mb = new JMenuBar();
//        file = new JMenu("File");
//        edit = new JMenu("Edit");
//        help = new JMenu("Help");
//        edit.add(cut);
//        edit.add(copy);
//        edit.add(paste);
//        edit.add(selectAll);
//        mb.add(file);
//        mb.add(edit);
//        mb.add(help);
//        //end menu at top

//        ta = new JTextArea();
//        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
//        mainFrame.add(mb);  //add menu bar
//       hello = new JLabel("hello", JLabel.CENTER);
//        hello.setSize(400, 200);
//        mainFrame.add(hello);
//        mainFrame.add(ta);//add typing area

//        mainFrame.setJMenuBar(mb); //set menu bar



        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
//        controlPanel = new JPanel();
//        controlPanel.setLayout(new FlowLayout()); //set the layout of the pannel

//        mainFrame.add(controlPanel);
//        mainFrame.setVisible(true);
    }

    private void showEventDemo() {

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4");
        JButton button5 = new JButton("button 5");

//        button1.addActionListener(new Easy1.ButtonClickListener());
//        button2.addActionListener(new Easy1.ButtonClickListener());
//        button3.addActionListener(new Easy1.ButtonClickListener());
//        button4.addActionListener(new Easy1.ButtonClickListener());
//        button5.addActionListener(new Easy1.ButtonClickListener());


        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(button5);
        mainFrame.setVisible(true);
    }
}
