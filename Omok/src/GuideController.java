import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GuideController implements MouseListener{
	Guide guide;
	MainFrame frame;
	Intro intro;
	
	public GuideController(Guide guide,MainFrame frame,Intro intro){
		this.guide=guide;
		this.frame=frame;
		this.intro=intro;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if((e.getX()>600&&e.getX()<750)&&(e.getY()>600&&e.getY()<670)){
			frame.contentPane.remove(guide);
			frame.contentPane.add(intro);
			frame.setSize(900, 900);
			frame.setVisible(true);
			intro.clickplay();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
