import javax.swing.*;
import java.awt.*;

public class MultiLayoutEx extends JFrame {

    public static void main(String[] args) {
        MultiLayoutEx multiLayoutEx = new MultiLayoutEx();
    }

    public MultiLayoutEx() {
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel header = new JPanel(new FlowLayout());
        JPanel content = new JPanel(null);

        header.setBackground(Color.LIGHT_GRAY);
        header.add(new JButton("Open"));
        header.add(new JButton("Read"));
        header.add(new JButton("Close"));


        JLabel textOne = new JLabel("Love");
        textOne.setLocation(20, 30);
        textOne.setSize(50, 30);
        JLabel textTwo = new JLabel("Java");
        textTwo.setLocation(150, 100);
        textTwo.setSize(50, 30);
        JLabel textThree = new JLabel("Hello");
        textThree.setLocation(50, 135);
        textThree.setSize(50, 30);

        content.add(textOne);
        content.add(textTwo);
        content.add(textThree);

        Container c = getContentPane();

        c.add(header, BorderLayout.NORTH);
        c.add(content, BorderLayout.CENTER);

        setVisible(true);

    }

    class Header extends JPanel {

    }
}
