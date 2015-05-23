import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ImagePanel extends JPanel {
	
	ImageIcon img;
	public ImagePanel(String path) 
	{
		img = new ImageIcon(path);
	}
	public void paintComponent(Graphics g)
	{
		g.drawImage(img.getImage(), 0, 0,null);
		setOpaque(false);
		super.paintComponent(g);
	}

}
