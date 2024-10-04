import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CalculatorEx extends JFrame {

    public static void main(String[] args) {
        CalculatorEx calculatorEx = new CalculatorEx();
    }

    public CalculatorEx() throws HeadlessException {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        JPanel resultPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        JTextField comp = new JTextField("");
        comp.setSize(200, 100);
        resultPanel.add(comp, BorderLayout.CENTER);

        List<String> numpads = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");

        numpads.forEach(val -> {
            inputPanel.add(new JButton(val));
        });

        Container c = getContentPane();

        c.add(resultPanel, BorderLayout.NORTH);
        c.add(inputPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
