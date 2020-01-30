package ppk;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Path2D;

/*
 * @author Aravind Thillai Villalan
 * @since 01-29-2020
 */
public class Triangle {

    int x, y, width, height;

    public Triangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
	public void draw(Graphics graphic) {
		Path2D dot=new Path2D.Double();
		dot.moveTo(x, y);
		dot.lineTo(x+100, y-150);
		dot.lineTo(x+200, y);
		dot.closePath();
		
		Graphics2D g2 = (Graphics2D) graphic;
		g2.draw(dot);
		g2.setColor(Color.RED);
		g2.fill((Shape)dot);
	}

}
