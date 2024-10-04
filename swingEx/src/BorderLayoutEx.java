import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BorderLayoutEx extends JFrame {

    public static void main(String[] args) {
        GridLayoutEx gridLayoutEx = new GridLayoutEx();
    }

    public BorderLayoutEx() throws HeadlessException {
        setTitle("BorderLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new BorderLayout(30, 40));
        List<String> buttonTexts = List.of("add", "sub", "mul", "div", "Calculate");

        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("div"), BorderLayout.WEST);
        c.add(new JButton("Cal"), BorderLayout.CENTER);

        setVisible(true);
    }
}

