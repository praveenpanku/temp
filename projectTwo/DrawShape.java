package ppk;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class DrawShape extends JPanel{
	
	public Circle c;
	public Square s;
	public Triangle t;
	public String shape = "triangle";
	public DrawShape()
	{
    	
    	switch(shape)
    	{
    	case "circle":  c = new Circle(0,0);break;
    	case "square": s  = new Square(0,0);break;
    	case "triangle": t = new Triangle(0,0);break;
    	}
        repaint();	
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch(shape)
    	{
    	case "circle":  c.draw(g);break;
    	case "square": s.draw(g);break;
    	case "triangle": t.draw(g); ;break;
    	}
        
    }
}
