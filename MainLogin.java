package attendB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainLogin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static MainLogin frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new MainLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblStudentManagement = new JLabel("Student Attendance Management");
		lblStudentManagement.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudentManagement.setForeground(Color.GRAY);
		
		JButton btnFacultyLogin = new JButton("Faculty Login");
		btnFacultyLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			FacultyLogin.main(new String[]{});
			frame.dispose();
			}
		});
		btnFacultyLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnStudentLogin = new JButton("Student Login");
		btnStudentLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentLogin.main(new String[]{});
			}
		});
		btnStudentLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addComponent(lblStudentManagement))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(140)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnStudentLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnFacultyLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStudentManagement)
					.addGap(32)
					.addComponent(btnFacultyLogin, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnStudentLogin, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
