import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class IntroController implements ActionListener {
	Intro intro;
	Timethread timethread;
	MainFrame frame;
	JButton surrenderbt;
	JButton button1,button2,button3;
	public IntroController (Intro intro, JButton button1,JButton button2,JButton button3, MainFrame frame,Timethread timethread){
		this.intro = intro;
		this.button1 = button1;
		this.button2 = button2;
		this.button3 = button3;
		this.frame = frame;
		this.timethread = timethread;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			Model model = new Model();
			Board board = new Board(model,timethread);
			frame.contentPane.remove(intro);
			frame.contentPane.add(board);
			frame.setSize(900, 1000);
			board.addMouseListener(new Controller(model, board, frame,intro));
			frame.setVisible(true);
			intro.play();
			intro.playdaeguk();
		}
		if(e.getSource() == button2) {
			Guide guide=new Guide();
			frame.contentPane.remove(intro);
			frame.contentPane.add(guide);
			guide.addMouseListener(new GuideController(guide,frame,intro));
			frame.setSize(841,751);
			frame.setVisible(true);
			intro.clickplay();
		}
		if(e.getSource()== button3){
			System.exit(1);
		}
			
	}
}
