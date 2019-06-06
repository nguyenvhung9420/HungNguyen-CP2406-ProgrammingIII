import java.awt.FlowLayout;
import java.util.Random;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class JCapiptals {

    String selectedValue;
 
    public static void main(String[] args) {
        
        String[] nations = new String[5];
        nations[0] = "USA";
        nations[1] = "France";
        nations[2] = "Vietnam";
        nations[3] = "Italy";
        nations[4] = "Brasil";

        String[] capitals = new String[5];
        capitals[0] = "Washington DC";
        capitals[1] = "Paris";
        capitals[2] = "Hanoi";
        capitals[3] = "Rome";
        capitals[4] = "Sao Paulo";

        JComboBox comboNations = new JComboBox();
        for (String nation: nations) {
            comboNations.addItem(nation);
         }
        
    
        JFrame frame = new JFrame("JFrame Example");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
 
        JLabel label = new JLabel("This is a label!");
 
        JButton button = new JButton();
        button.setText("Get Capital");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                for (int i =0 ; i < nations.length; i++){
                    if (comboNations.getSelectedItem().toString() == nations[i]){
                        label.setText("The capital of " + nations[i] + " is " + capitals[i]);
                        break;
                    }
                }
                
            }
          });

        panel.add(comboNations);

        panel.add(label);
        panel.add(button);
        
 
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
 
    }
 
}
