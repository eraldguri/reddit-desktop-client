/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package reddit;

import javax.swing.SwingUtilities;
import reddit.gui.Gui;

public class App {
    
    public static void main(String[] args) {
     
       
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Gui.createAndShowGui();
         }
        });
    }
}