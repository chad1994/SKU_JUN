import java.awt.Container;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
//	Board board=null;
//	Intro intro=null;
	Container contentPane=this.getContentPane();

	
	public MainFrame(){
		setTitle("5MOK_by_Sku_Junyeong");
	}
	
//	public void changepanel(String panelname){
//		if(panelname.equals("board")){
//			frame.contentPane.removeAll();
//			frame.contentPane.add(board);
//			revalidate();
//			repaint();
//		}
//		else
//			repaint();
//	}
	//---------------------------------------------------------------------
	public void play() {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("win.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
		} catch (Exception e) {
			System.out.println("����");
		}
	}
	//---------------------------------------------------------------------
}
