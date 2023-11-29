import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HTML {
    private JFrame mainFrame;
    private JLabel keyWord;
    private JLabel url;
    private JLabel results;
    private JPanel allKeyWord;
    private JPanel allUrl;
    private JPanel top;
    private JPanel topHalf;

    private JTextField keyWordTF;
    private JTextField urlTF;
    private int WIDTH=800;
    private int HEIGHT=700;


    public HTML() {
        prepareGUI();
    }

    public static void main(String[] args) {
        HTML html = new HTML();
        html.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2,1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        allKeyWord = new JPanel();
        allKeyWord.setLayout(new BorderLayout()); //set the layout of the pannel

        allUrl = new JPanel();
        allUrl.setLayout(new BorderLayout()); //set the layout of the pannel

        top = new JPanel();
        top.setLayout(new GridLayout(1,2)); //set the layout of the pannel

        topHalf = new JPanel();
        topHalf.setLayout(new BorderLayout()); //set the layout of the pannel

        top.add(allKeyWord);
        top.add(allUrl);

        topHalf.add(top, BorderLayout.CENTER);

        keyWordTF = new JTextField();
        urlTF = new JTextField();


        keyWord = new JLabel("enter your key word:");
        keyWord.setHorizontalAlignment(JLabel.CENTER);
        url = new JLabel("enter your url:");
        url.setHorizontalAlignment(JLabel.CENTER);
        results = new JLabel("results");
        results.setHorizontalAlignment(JLabel.CENTER);
    }

    private void showEventDemo() {

        JButton go = new JButton("go");

        allKeyWord.add(keyWord, BorderLayout.NORTH);
        allKeyWord.add(keyWordTF, BorderLayout.CENTER);

        allUrl.add(url, BorderLayout.NORTH);
        allUrl.add(urlTF, BorderLayout.CENTER);

        topHalf.add(go, BorderLayout.SOUTH);

        mainFrame.add(topHalf);
        mainFrame.add(results);

        //mainFrame.add(button3, BorderLayout.SOUTH);
        mainFrame.setVisible(true);

    }

}
