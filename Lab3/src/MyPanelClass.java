import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        int dimensionOfOval = 55;
                        //Paint the background
                        g.setColor(Color.BLACK);
                       
                        //g.fillRect(x1, y1, width, height); fixed so it fills the entire window
                        g.fillRect(x1, y1, width + 1, height + 1);
                      
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        //g.drawRect(x1, y1, width + 1, height + 1);  Checking why adding 1 to draw is not recommended
//                        
//                        //Adding an internal border
//                        g.setColor(Color.CYAN);
//                        g.drawRect(x1+25, y1+25, width-50, height-50);
//                        
//                        //First line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Second line
//                        g.setColor(Color.GREEN);
//                        g.drawLine(x1, y2, x2, 0);
                        
                        g.setColor(Color.LIGHT_GRAY);
                        //g.drawOval(x1, y1, width, height); Edited out the border oval to a filled oval
                        g.fillOval((getWidth()/2) - (dimensionOfOval/2), (getHeight()/2) - (dimensionOfOval/2) , dimensionOfOval, dimensionOfOval);
                        
            }
}