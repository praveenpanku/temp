import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javafx.scene.input.MouseButton;

public class makeDraggable {
		public static int count=0;
		public static int[] X = new int[10];
		public static int[] Y = new int[10];
		
		public static void main(String[] args) {
			JFrame jFrame = new JFrame("makeDraggable.java");
			jFrame.setSize(1000, 800);

			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1000, 800);
			panel.setBackground(Color.gray);

//			JButton button = new JButton();
//			setPos(button,0);
//			button.setBackground(Color.RED);

			panel.addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent mouseClick) {
					if (mouseClick.getButton() == 1)
					{
						addShapeonClick(panel, mouseClick.getX(), mouseClick.getY());
					}
				}
				@Override
				public void mouseEntered(MouseEvent e) {}
				@Override
				public void mouseExited(MouseEvent e) {}
				@Override
				public void mousePressed(MouseEvent e) {}
				@Override
				public void mouseReleased(MouseEvent e) {}
			});
        
//			panel.add(button);
			jFrame.add(panel);
			jFrame.setLayout(null);
			jFrame.setVisible(true);
		}
    
    public static void setPos(JButton button,int count)
    {
    	button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
            	int final_x = mouseEvent.getXOnScreen() + X[count];
            	int final_y = mouseEvent.getYOnScreen() + Y[count];
            	if (final_x > 950) {
            		final_x = 950;
            	}
            	else if (final_x < 0) {
            		final_x = 0;
            	}
            	if (final_y > 745) {
            		final_y = 745;
            	}
            	else if (final_y < 0) {
            		final_y = 0;
            	}
                button.setLocation(final_x, final_y);
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                X[count] = button.getX() - mouseEvent.getXOnScreen();
                Y[count] = button.getY() - mouseEvent.getYOnScreen();
            }
        });
    }
    public static void addShapeonClick(JPanel panel, int x, int y)
    {
    	JButton buttonx = new JButton();
    	System.out.println(x+","+y);
		buttonx.setBounds(x, y, x+100, y+100);
		setPos(buttonx,count++);
		System.out.println(count+","+X[count]+ "," +Y[count]);
		System.out.println("in addshape");
        buttonx.setBackground(Color.RED);
        panel.add(buttonx);
    }
}
