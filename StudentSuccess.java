package attendB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentSuccess extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static StudentSuccess frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StudentSuccess();
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
	public StudentSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblStudentSection = new JLabel("Student Section");
		lblStudentSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnViewAttendance = new JButton("View Student Details");
		btnViewAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				students.main(new String[]{});
			}
		});
		btnViewAttendance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		JButton btnSelectCourse = new JButton("View Attendance");
		btnSelectCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAttendance.main(new String[]{});
			}
		});
		btnSelectCourse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(81, Short.MAX_VALUE)
					.addComponent(lblStudentSection)
					.addGap(54))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(132)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSelectCourse, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewAttendance, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					
		)));
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStudentSection)
					.addGap(18)
					.addComponent(btnViewAttendance, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnSelectCourse, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
