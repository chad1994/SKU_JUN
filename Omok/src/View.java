import java.awt.Dimension;

import javax.swing.JFrame;

public class View {
	
	MainFrame frame = new MainFrame();
	Intro intro = new Intro(frame);
	public View() {
		// JFrame frame=new JFrame("5Mok");
		// Container contentPane = frame.getContentPane();
		
		frame.contentPane.add(intro);
		intro.bgmplay();
		// contentPane.add(board);
		frame.setPreferredSize(new Dimension(900, 900));// 프레임크기 지정
		frame.setLocation(500, 20);// 프레임 실행 위치 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	// *******패널 화면 바꾸기
//	public void changepanel(String panelname) { 
//
//		if (panelname.equals("board")) {
//			frame.contentPane.removeAll();
//			frame.contentPane.add(board); 
//			frame.revalidate();
//			frame.repaint();
//		}
//
//	}
	
}
