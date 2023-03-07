
import java.net.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MazeColor extends JFrame{

    public static Color GREEN;
	public static Color RED;
	public static Color BLUE;

    MazeColor (){

    

        this.setDefaultCloseOperation(MazeColor.EXIT_ON_CLOSE);
        this.setSize(480, 530);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

  
        // JLabel
        ImageIcon mazeColorBg = new ImageIcon("MazeColor2.gif");
        JLabel label = new JLabel();
        label.setIcon(mazeColorBg);



        // JButton
        JButton redBtn = new JButton();
        redBtn.setText("RED");
        EventHandler redHandler = new EventHandler(Color.RED);
        redBtn.addActionListener(redHandler);

        JButton greenBtn = new JButton();
        greenBtn.setText("GREEN");
        EventHandler greenHandler = new EventHandler(Color.GREEN);
        greenBtn.addActionListener(greenHandler);

        JButton blueBtn = new JButton();
        blueBtn.setText("BLUE");
        EventHandler blueHandler = new EventHandler(Color.BLUE);
        blueBtn.addActionListener(blueHandler);
       
        
        add(label);
        add(redBtn);
        add(greenBtn);
        add(blueBtn);

       
        


    }

    
    private class EventHandler implements ActionListener {
        Color colors;
   
    
        public EventHandler(Color colorOfMaze) {
         this.colors = colorOfMaze; 


        }

        public void actionPerformed(ActionEvent event) {

            Board board = new Board(); 
            board.mazeColor = this.colors;
            
          
            new Pacman();
            dispose();
            
        }
    }
       

}

       
                
        
    

