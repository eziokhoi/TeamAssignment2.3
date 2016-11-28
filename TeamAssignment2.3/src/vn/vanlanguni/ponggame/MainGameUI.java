/*
 * 
 * 
 * 
 * 
 */
package vn.vanlanguni.ponggame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author Invisible Man
 *
 */
public class MainGameUI extends JFrame{
	private static final int _HEIGHT = 500;
	private static final int _WIDTH = 500;
	private PongPanel pongPanel;
	
	public MainGameUI(){
		setPreferredSize(new Dimension(_WIDTH, _HEIGHT));
		setLayout(new BorderLayout());
		setTitle("Pong Game - K21T Ltd.");
		pongPanel = new PongPanel();
		 this.setResizable(false);
		 Sound1.bgMusic.play();
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		getContentPane().add(pongPanel, BorderLayout.CENTER);
		pack();
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				closeApplication();
			}
        //Exit Window Pops Up
			public void closeApplication(){
				int result = JOptionPane.showConfirmDialog(null,"Want to close this program?","Confirm",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if ( result == JOptionPane.YES_OPTION){
					System.exit(0);
				}
				
				
			}	
		});
	}
    public static void main(String[] args) {
       MainGameUI mainFrame = new MainGameUI();
       mainFrame.setVisible(true);
    }
}