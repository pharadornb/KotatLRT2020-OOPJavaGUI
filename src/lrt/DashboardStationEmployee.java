package lrt;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashboardStationEmployee extends EmployeeLogin {

	private JFrame frmDashboardstationemployees;
	public String path;
	public ImageIcon MyImage;
	public Image img;
	public Image newImg;
	public ImageIcon image;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardStationEmployee window = new DashboardStationEmployee();
					window.frmDashboardstationemployees.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DashboardStationEmployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDashboardstationemployees = new JFrame();
		frmDashboardstationemployees.setTitle("DashboardStation&Employees - LRTKORAT");
		frmDashboardstationemployees.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Java\\ProjectAdvOOAGroup1\\images\\LRTLOGO2.png"));
		frmDashboardstationemployees.setBounds(100, 100, 1280, 800);
		frmDashboardstationemployees.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDashboardstationemployees.getContentPane().setLayout(null);
		
		/*JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\3143170.jpg"));
		lblNewLabel2.setBackground(SystemColor.windowText);
		lblNewLabel2.setForeground(SystemColor.textHighlight);
		lblNewLabel2.setBounds(-130, 128, 731, 211);
		frmDashboardstationemployees.getContentPane().add(lblNewLabel2);
		ImageIcon MyImage2 = new ImageIcon(path);
		Image img2 = MyImage2.getImage();
		Image newImg2 = img2.getScaledInstance(lblNewLabel2.getWidth(), lblNewLabel2.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image2 = new ImageIcon(newImg2);
		lblNewLabel2.setIcon(image2);*/
		
		JLabel Logo = new JLabel();
		Logo.setBounds(158, 11, 159, 201);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\LRTLOGO1.png";
		frmDashboardstationemployees.getContentPane().add(Logo);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Logo.setIcon(image);
		
		JLabel lblNewLabel = new JLabel("KORAT LIGHT-RAIL TRANSPORT (LRTKORAT)");
		lblNewLabel.setForeground(new Color(147, 112, 219));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SUT", Font.BOLD, 50));
		lblNewLabel.setBounds(341, 36, 785, 80);
		frmDashboardstationemployees.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Status :");
		lblNewLabel_1.setFont(new Font("SUT", Font.BOLD, 40));
		lblNewLabel_1.setBounds(44, 261, 219, 44);
		frmDashboardstationemployees.getContentPane().add(lblNewLabel_1);
		
		JLabel lbStationID = new JLabel("??");
		lbStationID.setFont(new Font("SUT", Font.PLAIN, 40));
		lbStationID.setBounds(176, 261, 191, 44);
		frmDashboardstationemployees.getContentPane().add(lbStationID);
		
		JLabel lblOriginstation = new JLabel("Station Name : ");
		lblOriginstation.setFont(new Font("SUT", Font.BOLD, 40));
		lblOriginstation.setBounds(377, 261, 228, 44);
		frmDashboardstationemployees.getContentPane().add(lblOriginstation);
		
		JLabel lbOriginStation = new JLabel("??");
		lbOriginStation.setFont(new Font("SUT", Font.PLAIN, 40));
		lbOriginStation.setBounds(593, 261, 326, 44);
		frmDashboardstationemployees.getContentPane().add(lbOriginStation);
		
		JLabel lblZone = new JLabel("Zone : ");
		lblZone.setFont(new Font("SUT", Font.BOLD, 40));
		lblZone.setBounds(938, 261, 108, 44);
		frmDashboardstationemployees.getContentPane().add(lblZone);
		
		JLabel lbZone = new JLabel("??");
		lbZone.setFont(new Font("SUT", Font.PLAIN, 40));
		lbZone.setBounds(1056, 261, 153, 44);
		frmDashboardstationemployees.getContentPane().add(lbZone);
		
		JButton btnRegisterMember = new JButton(" Register");
		btnRegisterMember.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\business_application_addmale_useradd_insert_add_user_client_2312.png"));
		btnRegisterMember.setSelectedIcon(null);
		btnRegisterMember.setFont(new Font("SUT", Font.BOLD, 60));
		btnRegisterMember.setBounds(303, 500, 306, 100);
		frmDashboardstationemployees.getContentPane().add(btnRegisterMember);
		
		JButton btnAddWaletMember = new JButton(" Wallet");
		btnAddWaletMember.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\wallet_payment_purchase_coin_cash_money_icon_141978.png"));
		btnAddWaletMember.setFont(new Font("SUT", Font.BOLD, 60));
		btnAddWaletMember.setBounds(636, 500, 306, 100);
		frmDashboardstationemployees.getContentPane().add(btnAddWaletMember);
		
		JButton btnLrtKoratTicket = new JButton(" Ticket Machine");
		btnLrtKoratTicket.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\business_ticket_2363.png"));
		btnLrtKoratTicket.setFont(new Font("SUT", Font.BOLD, 60));
		btnLrtKoratTicket.setBounds(303, 359, 639, 100);
		frmDashboardstationemployees.getContentPane().add(btnLrtKoratTicket);
		
		JButton BtnLogoutStation = new JButton("Station");
		BtnLogoutStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		BtnLogoutStation.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\logout_icon_138409.png"));
		BtnLogoutStation.setForeground(Color.BLACK);
		BtnLogoutStation.setFont(new Font("Tahoma", Font.PLAIN, 30));
		BtnLogoutStation.setBackground(SystemColor.activeCaption);
		BtnLogoutStation.setBounds(1029, 680, 225, 55);
		frmDashboardstationemployees.getContentPane().add(BtnLogoutStation);
		
		JLabel lblNewLabel_2 = new JLabel("\u0E23\u0E16\u0E44\u0E1F\u0E1F\u0E49\u0E32\u0E23\u0E32\u0E07\u0E40\u0E1A\u0E32\u0E42\u0E04\u0E23\u0E32\u0E0A");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("SUT", Font.BOLD, 40));
		lblNewLabel_2.setBounds(314, 102, 306, 65);
		frmDashboardstationemployees.getContentPane().add(lblNewLabel_2);
		
		/*JLabel title = new JLabel("New label");
		title.setForeground(Color.ORANGE);
		title.setBounds(34, 80, 46, 14);
		frmDashboardstationemployees.getContentPane().add(title);*/
		
		JLabel Title2 = new JLabel();
		Title2.setBounds(124, 0, 1021, 226);
		path = "C:\\\\Java\\\\ProjectAdvOOAGroup1\\\\images\\\\3143170.jpg";
		frmDashboardstationemployees.getContentPane().add(Title2);
		MyImage = new ImageIcon(path);
		img = MyImage.getImage();
		newImg = img.getScaledInstance(Title2.getWidth(), Title2.getHeight(), Image.SCALE_SMOOTH);
		image = new ImageIcon(newImg);
		Title2.setIcon(image);
		
		JButton btnEmployee = new JButton(" Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//EmployeeLogin el = new EmployeeLogin();
				//el.setTitle("Wow");
				//el.setVisible(true);
			}
		});
		btnEmployee.setIcon(new ImageIcon("C:\\Java\\ProjectAdvOOAGroup1\\images\\logout_icon_138409.png"));
		btnEmployee.setForeground(Color.BLACK);
		btnEmployee.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnEmployee.setBackground(SystemColor.activeCaption);
		btnEmployee.setBounds(10, 680, 225, 55);
		frmDashboardstationemployees.getContentPane().add(btnEmployee);
		
		
	}
}