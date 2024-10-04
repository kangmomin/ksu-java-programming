import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FlowLayoutEx extends JFrame {

    public static void main(String[] args) {
        GridLayoutEx gridLayoutEx = new GridLayoutEx();
    }

    public FlowLayoutEx() throws HeadlessException {
        setTitle("FlowLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        List<String> buttonTexts = List.of("add", "sub", "mul", "div", "Calculate");
        buttonTexts.forEach(val -> {
            c.add(new JButton(val));
        });

        setVisible(true);
    }
}
