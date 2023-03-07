import java.awt.Color;

public class App { 
    public static void main (String[] args) {

Home main = new Home();    

// exit button 
main.setDefaultCloseOperation(main.EXIT_ON_CLOSE);
//frame size
main.setSize(480,540);
//frame visible 
main.setVisible(true);
// frame is centered
main.setLocationRelativeTo(null);
//cant resize frame
main.setResizable(false);
// background color
main.getContentPane().setBackground(new Color(8, 15, 61));
        }
    }
