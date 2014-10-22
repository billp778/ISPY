import java.awt.BorderLayout;
import java.awt.EventQueue;
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


public class SecondGame extends JFrame {

	private JPanel SecondGame;
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
					SecondGame frame = new SecondGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SecondGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1127, 667);
		SecondGame = new JPanel();
		SecondGame.setBackground(Color.BLACK);
		SecondGame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(SecondGame);
		SecondGame.setLayout(null);
		
		image1 = new ImageIcon(getClass().getResource("ISpy2.JPG"));
		
		lblISpy1 = new JLabel(image1);
		lblISpy1.setBounds(10, 11, 800, 600);
		SecondGame.add(lblISpy1);
		
		label1 = new JLabel("Try to Find This:");
		label1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label1.setForeground(Color.GREEN);
		label1.setBounds(820, 26, 165, 50);
		SecondGame.add(label1);
		
		label2 = new JLabel("Find the Doll");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label2.setForeground(Color.GREEN);
		label2.setBounds(835, 113, 252, 137);
		SecondGame.add(label2);
		
		statusbar = new JLabel();
		statusbar.setForeground(Color.GREEN);
		statusbar.setBounds(849, 342, 200, 50);
		SecondGame.add(statusbar);
		
		count = 1;

		event action = new event();
		lblISpy1.addMouseListener(action);
		
	}
	
	private class event implements MouseListener, ActionListener
	{
		public void mouseClicked(MouseEvent event) {
			
			lblISpy1.setIcon(image1);
			if(count==1)
				label2.setText("Find the Snowman");
			else if(count==2)
				label2.setText("Find the Red Bird");
			else if(count==3)
				label2.setText("Find the Teddy Bear");
			else
			{
				label2.setText("This is the end.....next picture");
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