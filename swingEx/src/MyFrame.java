import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {}

public class MyFrame extends JFrame {

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

        myFrame.setContentPane(myFrame);
    }

    public MyFrame() {
        setTitle("My Frame");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        JButton button = new JButton("Button");
        contentPane.add(button);

        setVisible(true);
    }
}
