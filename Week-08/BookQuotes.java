import java.awt.FlowLayout;
 
import javax.swing.*;
 
public class BookQuotes {

    public static void main(String[] args) {
 
        JFrame frame = new JFrame("JFrame Example");
 
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
 
        JLabel label1 = new JLabel("\"You don’t have to live forever, you just have to live.\"");
        JLabel label2 = new JLabel("\"He stepped down, trying not to look long at her as if she were the sun…\"");
 
        panel.add(label1);
        panel.add(label2);
 
        frame.add(panel);
        frame.setSize(600, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
    }
 
}