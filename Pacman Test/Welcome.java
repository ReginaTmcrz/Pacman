import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import java.awt.*;


public class Welcome extends JFrame implements ActionListener{
   
    Board board = new Board();
    JButton nextBtn = new JButton();
    JTextField username = new JTextField();

   
    Welcome(){



    
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setSize(465,534);
this.setVisible(true);
this.setLayout(new FlowLayout());
this.setLocationRelativeTo(null);
this.setResizable(false);
this.setLocationRelativeTo(null);
this.getContentPane().setBackground(new Color(8, 15, 61));

username.setPreferredSize(new Dimension(250,40));



nextBtn.setText("Next");
nextBtn.setFont(new Font("Serif Bold", Font.BOLD,20));
EventHandler handler = new EventHandler();

nextBtn.addActionListener(handler);

JLabel label = new JLabel("Enter username: "); 
label.setFont(new Font("sansserif", Font.BOLD,20));








this.add(username);
this.add(nextBtn);
this.add(label);




    }

 

    private class EventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (username.getText().length() <= 0) {
            
            JOptionPane.showMessageDialog(null, "you must enter a username");


            } else{
               // pacs.userinput.setText("Welcome " + username.getText());
               board.playerName = username.getText();
                new Difficulty();
                dispose();                         
            }
       


    }
}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    
}
