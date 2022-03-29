/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reddit.gui;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Gui extends JPanel {
    
    private static Gui myPanel;
   private static JFrame myFrame;
   public Gui() {
      super();
   }
   
   @Override
   public Dimension getPreferredSize() {
      return new Dimension(700,350);
   }
    
    public static void createAndShowGui() {
      myFrame = new JFrame("Reddit");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setLocation(30,30);
      myPanel = new Gui();
      myFrame.add(myPanel);
      myFrame.pack();
      myFrame.setVisible(true);
    }
    
}
