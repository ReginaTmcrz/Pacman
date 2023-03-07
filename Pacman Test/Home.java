import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Home extends JFrame {

    Home() {
        super("Home Page");
        this.setLayout(new FlowLayout());
        ImageIcon pacmanIcon = new ImageIcon("HomePage.gif");
        ImageIcon starbtn = new ImageIcon("StartGame.png");

        JLabel label = new JLabel();
        label.setIcon(pacmanIcon);

        JButton startButton = new JButton();
        startButton.setMargin(getInsets());
        startButton.setIcon(starbtn);
       
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);
        this.add(label);
        this.add(startButton);

    }
    // Event Handler Class
    private class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
//    JOptionPane.showMessageDialog(null, "<3");

  new Welcome();
  dispose();
    }
}
}