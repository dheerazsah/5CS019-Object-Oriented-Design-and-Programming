import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class test extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JTextField passwordField;
	private JLabel displayPassword;
	private JLabel displayUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-14, -37, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{128, 62, 29, 85, 0};
		gbl_contentPane.rowHeights = new int[]{44, 25, 49, 19, 19, 21, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		usernameField = new JTextField();
		GridBagConstraints gbc_usernameField = new GridBagConstraints();
		gbc_usernameField.anchor = GridBagConstraints.NORTHEAST;
		gbc_usernameField.insets = new Insets(0, 0, 5, 0);
		gbc_usernameField.gridwidth = 2;
		gbc_usernameField.gridx = 2;
		gbc_usernameField.gridy = 3;
		contentPane.add(usernameField, gbc_usernameField);
		usernameField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		passwordField = new JTextField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.anchor = GridBagConstraints.NORTHEAST;
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 4;
		contentPane.add(passwordField, gbc_passwordField);
		passwordField.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var user = usernameField.getText();
				var pw = passwordField.getText();
				displayUsername.setText(user);
				displayPassword.setText(pw);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 5;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		displayUsername = new JLabel("Username");
		GridBagConstraints gbc_displayUsername = new GridBagConstraints();
		gbc_displayUsername.insets = new Insets(0, 0, 0, 5);
		gbc_displayUsername.gridx = 1;
		gbc_displayUsername.gridy = 7;
		contentPane.add(displayUsername, gbc_displayUsername);
		
		displayPassword = new JLabel("Password");
		GridBagConstraints gbc_displayPassword = new GridBagConstraints();
		gbc_displayPassword.gridx = 3;
		gbc_displayPassword.gridy = 7;
		contentPane.add(displayPassword, gbc_displayPassword);
	}
}
