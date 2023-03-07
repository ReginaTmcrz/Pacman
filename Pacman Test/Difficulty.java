import javax.swing.JFrame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.security.cert.LDAPCertStoreParameters;
import java.awt.event.ActionEvent;
import java.awt.*;


public class Difficulty extends JFrame  {



    Difficulty(){

        JPanel panel = new JPanel();


            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setSize(465,534);
            this.setVisible(true);
            this.setLayout(new FlowLayout());
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.getContentPane().setBackground(new Color(8, 15, 61));
                

            // ImageIcon pacmanIcon = new ImageIcon("test.png");

            // JLabel label = new JLabel();
            // label.setIcon(pacmanIcon);
        
        


            JButton easyButton = new JButton();
            easyButton.setText("EASY");
            easyButton.setFont(new Font("Arial", Font.BOLD, 30));
            EventHandler easyHandler = new EventHandler(9, 6);
            easyButton.addActionListener(easyHandler);



            JButton mediumButton = new JButton();
            mediumButton.setText("MEDIUM");
            mediumButton.setFont(new Font("Arial", Font.BOLD, 30));
            EventHandler mediumHandler = new EventHandler(6, 9);
            mediumButton.addActionListener(mediumHandler);

            JButton hardButton = new JButton();
            hardButton.setText("HARD");
            hardButton.setFont(new Font("Arial", Font.BOLD, 30));
            EventHandler hardHandler = new EventHandler(3, 12);
            hardButton.addActionListener(hardHandler);
         
        
    
            //add(label);
            add(easyButton);
            add(mediumButton);
            add(hardButton);


    }
    private class EventHandler implements ActionListener {

        int lives;
        int ghost;

        // Constructor
        EventHandler(int livesLeft, int numOfGhost) {
           
            this.lives = livesLeft;
            this.ghost = numOfGhost;
        }

    
     
    @Override
    public void actionPerformed(ActionEvent e) {
        Board board = new Board();
        board.pacsLeft = this.lives;
        board.N_GHOSTS = this.ghost;

        new MazeColor();
        dispose();
     
    }
    }
    }