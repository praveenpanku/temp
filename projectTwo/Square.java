package ppk;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/*
 * @author Aravind Thillai Villalan
 * @since 01-29-2020
 */

public class Square{

    int x, y, width, height;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
	public void draw(Graphics graphic) {
		Shape square=new Rectangle2D.Double(x, y,150,150);
		Graphics2D g2 = (Graphics2D) graphic;
		g2.draw(square);
		g2.setColor(Color.RED);
		g2.fill(square);
	}

}
