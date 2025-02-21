import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Guide extends JPanel {
	ImageIcon back;
	ImageIcon exit;
	MainFrame frame;
	public void paintComponent(Graphics g){
		g.drawImage(back.getImage(), 0, 0, 875, 735, null);
		g.drawImage(exit.getImage(), 600, 600, 150, 70, null);
	}
	
	public Guide(){
		setLayout(null);
		back = new ImageIcon("guidebackground.png");
		exit = new ImageIcon("guideexit.png");
		setOpaque(false);
	}
	
}
