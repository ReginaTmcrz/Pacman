
import javax.swing.*;
import javax.tools.DocumentationTool.Location;
import javax.xml.namespace.QName;

import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Pacman extends JFrame {
    //JLabel userinput = new JLabel();
  
   


   
    public Pacman() {  
        
   
        initUI();
       
    }
    private void initUI() { 
        
        add(new Board());
        setTitle("Pacman");
        JPanel panel = new JPanel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(470,560);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);
          
        // userinput.setVisible(true);
        // userinput.setLayout(new FlowLayout());
        

        

        // panel.add(userinput);
        add(panel, BorderLayout.NORTH);

    
    }

      
}
 
