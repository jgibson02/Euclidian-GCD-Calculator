package euclidiangcdcalculator;

import static euclidiangcdcalculator.CalculateGCD.getGCD;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author John Gibson
 */
public class EuclidianGCDCalculator extends CalculateGCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int FIELD_WIDTH = 5;
        Font f = new Font("SansSerif", Font.BOLD, 40);
        JFrame frame = new JFrame("GCD Calculator");
        JLabel firstInt = new JLabel("First Integer:");
        firstInt.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField firstIntField = new JTextField(FIELD_WIDTH);
        firstIntField.setFont(f);
        JLabel secondInt = new JLabel("Second Integer:");
        secondInt.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField secondIntField = new JTextField(FIELD_WIDTH);
        secondIntField.setFont(f);
        JLabel gcd = new JLabel();
        gcd.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton button = new JButton("Calculate GCD");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(firstInt);
        panel.add(firstIntField);
        panel.add(secondInt);
        panel.add(secondIntField);
        panel.add(button);
        panel.add(gcd);
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getRootPane().setDefaultButton(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m = Integer.parseInt(firstIntField.getText());
                int n = Integer.parseInt(secondIntField.getText());
                JOptionPane.showMessageDialog(null, "GCD: " + Integer.toString(getGCD(m, n)));
            }
        };
        button.addActionListener(listener);
    }

}
