import java.awt.FlowLayout;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class JFrameDisableButton2 {

    static int clickCount = 0;
 
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("JFrame Example");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
 
        JLabel label = new JLabel("This is a label!");
 
        JButton button = new JButton();
        button.setText("Press me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clickCount++;
                label.setText("You have clicked " + clickCount + " time(s).");
                if (clickCount == 8){
                    label.setText("Hey! That's enough!");
                    button.setEnabled(false);
                }
            }
          });
 
        panel.add(label);
        panel.add(button);
 
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
    }
 
}
