import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Guide extends JPanel {
	ImageIcon back;
	ImageIcon exit;
	MainFrame frame;
	public void paintComponent(Graphics g){
		g.drawImage(back.getImage(), 0, 0, 841, 751, null);
		g.drawImage(exit.getImage(), 550, 550, 200, 100, null);
	}
	
	public Guide(){
		setLayout(null);
		back = new ImageIcon("guidebackground.png");
		exit = new ImageIcon("guideexit.png");
		setOpaque(false);
	}
	
}
