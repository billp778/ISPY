import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JLabel;


public class ISPY {
	
	private JFrame frame;
	private JButton btnStart;
	private JButton btnExit;
	private JLabel lblWouldYouLike;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					ISPY window = new ISPY();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ISPY() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setSize(900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Start Button
		JButton btnStart = new JButton("Start");
		btnStart.setForeground(Color.BLACK);
		btnStart.setBackground(new Color(0, 255, 0));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose(); // closes out the frame
				FirstGame FirstGame=new FirstGame();
				FirstGame.setVisible(true);
				
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnStart.setBounds(317, 178, 212, 116);
		frame.getContentPane().add(btnStart);
		
		// Exit Button
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.BLACK);
		btnExit.setBackground(Color.GREEN);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose(); // closes out the frame
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnExit.setBounds(317, 313, 212, 138);
		frame.getContentPane().add(btnExit);
		
		// Title label "would you like to play ISPY?
		JLabel lblWouldYouLike = new JLabel("Would you like to play ISPY?");
		lblWouldYouLike.setBackground(Color.BLACK);
		lblWouldYouLike.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblWouldYouLike.setForeground(Color.GREEN);
		lblWouldYouLike.setBounds(171, 54, 540, 113);
		frame.getContentPane().add(lblWouldYouLike);
		
	}
}
