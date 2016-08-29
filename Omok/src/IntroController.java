import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class IntroController implements ActionListener {
	Intro intro;
	MainFrame frame;
	JButton button1;
	public IntroController (Intro intro, JButton button1, MainFrame frame){
		this.intro = intro;
		this.button1 = button1;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			Model model = new Model();
			Board board = new Board(model);
			frame.contentPane.remove(intro);
			frame.contentPane.add(board);
			frame.contentPane.add(board);
			board.addMouseListener(new Controller(model, board, frame));
			frame.setVisible(true);
			intro.play();
		}
			
	}
}
