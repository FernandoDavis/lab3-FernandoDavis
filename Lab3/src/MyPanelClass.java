import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
                        //g.setColor(Color.BLACK);
                       
                        //g.fillRect(x1, y1, width, height); fixed so it fills the entire window
                        //g.fillRect(x1, y1, width + 1, height + 1);
                      
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
                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        //g.drawOval(x1, y1, width, height); Edited out the border oval to a filled oval
//                        g.fillOval((x2/2) - (dimensionOfOval/2), (y2/2) - (dimensionOfOval/2) , dimensionOfOval, dimensionOfOval);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        //g.drawPolygon(p); Changed to fill polygon
//                        g.fillPolygon(p);
                        
                        //Rectangles
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, x2 + 1, y2 + 1);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y2/5, x2 + 1, y2 - (y2/5) * 4);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, (y2/5) * 3, x2 + 1, y2 - (y2/5) * 4);
                        
                        //Triangle
                        Polygon p = new Polygon();
                        p.addPoint(x1, 0);
                        p.addPoint(x1, y2);
                        p.addPoint(x2/2, y2/2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                        //Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);                       
            }
}