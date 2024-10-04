import javax.swing.*;
import java.awt.*;

public class StaticLayoutEx extends JFrame {
    public static void main(String[] args) {
        StaticLayoutEx staticLayoutEx = new StaticLayoutEx();
    }

    public StaticLayoutEx() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel jLabel = new JLabel("Hello world!");
        jLabel.setLocation(130, 50);
        jLabel.setSize(200, 20);
        c.add(jLabel);

        for (int i = 0; i < 10; i++) {
            JButton b = new JButton("Button" + i);
            b.setLocation(i * 20 + i * 20, 50);
            b.setSize(30, 20);
            c.add(b);
        }

        setVisible(true);
    }
}
