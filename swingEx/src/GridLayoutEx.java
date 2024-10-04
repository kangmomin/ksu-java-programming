import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GridLayoutEx extends JFrame {

    public static void main(String[] args) {
        GridLayoutEx gridLayoutEx = new GridLayoutEx();
    }

    public GridLayoutEx() throws HeadlessException {
        setTitle("GridLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new GridLayout(4, 2, 0, 5));
        List<String> buttonTexts = List.of("add", "sub", "mul", "div", "Calculate");

        c.add(new JLabel("이름"));
        c.add(new JTextField());
        c.add(new JLabel("학번"));
        c.add(new JTextField());
        c.add(new JLabel("학과"));
        c.add(new JTextField());
        c.add(new JLabel("과목"));
        c.add(new JTextField());

        setVisible(true);
    }
}

