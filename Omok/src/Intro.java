import java.awt.Font;
import java.awt.Graphics;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Intro extends JPanel {
	ImageIcon back;
	MainFrame frame;
	JButton button1,button2,button3;
	JPanel buttonpanel;
	Timethread timethread;
//----------------------------------------------------------------------------페인트
	public void paintComponent(Graphics g){
		g.drawImage(back.getImage(), 0, 0, 900, 900, null);
		g.setFont(new Font("궁서",Font.BOLD, 100));
		g.drawString("Omok Game", 125, 300);
		setOpaque(false);
	}
	//*************************************************************************************************음악 삽입
	//------------------------------------------------------------------
	public void bgmplay() {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("bgm.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			clip.loop(-1);
		} catch (Exception e) {
			System.out.println("에러");
		}
	}
	//-------------------------------------------------
	public void clickplay() {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("click.wav"));
			Clip clip = AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.start();
		} catch (Exception e) {
			System.out.println("에러");
		}
	}
	//------------------------------------------------------------------
	public void byeplay() {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("BYE.wav"));
			Clip clip = AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.start();
		} catch (Exception e) {
			System.out.println("에러");
		}
	}
	//------------------------------------------------------------------
	public void play() {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("start.wav"));
			Clip clip = AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.start();
		} catch (Exception e) {
			System.out.println("에러");
		}
	}
	//-----------------------------------------------------------------------
	public void playdaeguk() {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File("startdaeguk.wav"));
			Clip clip = AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.start();
		} catch (Exception e) {
			System.out.println("에러");
		}
	}
	//-----------------------------------------------------------------------
	//***********************************************************intro 생성자
	public Intro(MainFrame frame){
		this.frame = frame;
		setLayout(null);
		
		back = new ImageIcon("introBackground.jpg");
		button1 = new JButton(new ImageIcon("startbutton.png"));
		button2 = new JButton(new ImageIcon("guidebutton.png"));
		button3 = new JButton(new ImageIcon("exitbutton.png"));
		button1.setLocation(330, 500);
		button2.setLocation(330, 600);
		button3.setLocation(330, 700);
		button1.setSize(170,66);
		button2.setSize(170,66);
		button3.setSize(170,66);
		add(button1);
		button1.setVisible(true);
		add(button2);
		button2.setVisible(true);
		add(button3);
		button3.setVisible(true);
		
//		this.add(buttonpanel);
//		buttonpanel.setSize(900, 450);
//		buttonpanel.setLocation(0,450);
//		buttonpanel.setVisible(true);
//		setVisible(true);
		
		IntroController introController = new IntroController(this, button1,button2,button3,frame,timethread);
		this.button1.addActionListener(introController);
		this.button2.addActionListener(introController);
		this.button3.addActionListener(introController);
		setOpaque(false);
	}
	

}
