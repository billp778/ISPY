import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;


public class FirstGame extends JFrame {

	private JPanel FirstGame;
	private JLabel lblISpy1;
	private JLabel label1;
	private JLabel label2;
	private JLabel statusbar;
	private ImageIcon image1;
	private int count;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstGame frame = new FirstGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FirstGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1127, 667);
		FirstGame = new JPanel();
		FirstGame.setBackground(Color.BLACK);
		FirstGame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(FirstGame);
		FirstGame.setLayout(null);
		
		image1 = new ImageIcon(getClass().getResource("ISPY1.jpg"));
		
		lblISpy1 = new JLabel(image1);
		lblISpy1.setBounds(10, 11, 800, 600);
		FirstGame.add(lblISpy1);
		
		label1 = new JLabel("Try to Find This:");
		label1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label1.setForeground(Color.GREEN);
		label1.setBounds(820, 26, 165, 50);
		FirstGame.add(label1);
		
		label2 = new JLabel("Find the Spring");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label2.setForeground(Color.GREEN);
		label2.setBounds(835, 113, 252, 137);
		FirstGame.add(label2);
		
		statusbar = new JLabel();
		statusbar.setForeground(Color.GREEN);
		statusbar.setBounds(849, 342, 200, 50);
		FirstGame.add(statusbar);
		
		count = 1;

		event action = new event();
		lblISpy1.addMouseListener(action);
		
	}
	
	private class event implements MouseListener, ActionListener
	{
		public void mouseClicked(MouseEvent event) {
			
			lblISpy1.setIcon(image1);
			if(count==1)
				label2.setText("Find the RubberBand");
			else if(count==2)
				label2.setText("Find the Fuse");
			else if(count==3)
				label2.setText("Find the Rock");
			else
			{
				SecondGame SecondGame=new SecondGame();
				SecondGame.setVisible(true);
				FirstGame.setVisible(false);
				count=0;
			}
			count++;

			statusbar.setText("Clicked at "+ event.getPoint().getX() +" "+ event.getPoint().getY());
			System.out.println(event.getPoint().getX() + " " + event.getPoint().getY());
			
		}

		public void mouseEntered(MouseEvent event) {

			statusbar.setText("you entered the area");
			
		}

		public void mouseExited(MouseEvent event) {

			statusbar.setText("the mouse has left the window");
			
		}

		public void mousePressed(MouseEvent event) {
			
			statusbar.setText("you pressed down the mouse");
			
		}

		public void mouseReleased(MouseEvent event) {
			
			statusbar.setText("you released the button");
			
		}

		public void actionPerformed(ActionEvent event) {

			
			
		}
		
	}	

}