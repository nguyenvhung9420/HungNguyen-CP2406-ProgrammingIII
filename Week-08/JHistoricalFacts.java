import java.awt.FlowLayout;
import java.util.Random;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class JHistoricalFacts {

    static int clickCount = 0;
    static int n;
 
    public static void main(String[] args) {

        Random rand = new Random();
        
        String[] labels = new String[5];
        labels[0] = "1945";
        labels[1] = "1954";
        labels[2] = "1973";
        labels[3] = "1975";
        labels[4] = "1991";
    
        JFrame frame = new JFrame("JFrame Example");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
 
        JLabel label = new JLabel("This is a label!");
 
        JButton button = new JButton();
        button.setText("Press me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                n = rand.nextInt(5);
                label.setText("This is " + labels[n]);
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
