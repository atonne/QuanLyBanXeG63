package app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class FrmDangNhap extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrmDangNhap().setVisible(true);
		
	}
	private JTextField txtTaiKhoan;
	private JPasswordField txtMatKhau;
	private JButton btnDangNhap;
	private JButton btnThoat;
	public FrmDangNhap() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Đăng nhập Cửa hàng xe máy G63");
		setSize(500,500);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(229, 229, 229));
		
		//connect database
		
		
		//Khai bao DAO
		
		//UI dang nhap
		
		Image imgHeader = Toolkit.getDefaultToolkit ().getImage ("data\\imgDangNhap\\bgHeader.png");
		JLabel lbHeaderDN = new JLabel("");
		lbHeaderDN.setBounds(0, 0, 488, 87);
		getContentPane().add(lbHeaderDN);
		Image imgresize = imgHeader.getScaledInstance(lbHeaderDN.getWidth(), lbHeaderDN.getHeight(), 0);
		lbHeaderDN.setIcon(new ImageIcon(imgresize));
		
		JLabel lblTaiKhoan = new JLabel("Tài khoản:");
		lblTaiKhoan.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblTaiKhoan.setForeground(Color.BLACK);
		lblTaiKhoan.setBounds(61, 194, 112, 20);
		getContentPane().add(lblTaiKhoan);
		
		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtTaiKhoan.setBorder(BorderFactory.createLineBorder(Color.black));

		txtTaiKhoan.setBounds(166, 188, 246, 33);
		getContentPane().add(txtTaiKhoan);
		txtTaiKhoan.setColumns(10);
		
		JLabel lblMatKhau = new JLabel("Mật khẩu:");
		lblMatKhau.setForeground(Color.BLACK);
		lblMatKhau.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblMatKhau.setBounds(61, 251, 112, 20);
		getContentPane().add(lblMatKhau);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(166, 244, 246, 33);
		txtMatKhau.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtMatKhau.setBorder(BorderFactory.createLineBorder(Color.black));
		getContentPane().add(txtMatKhau);
		
		JLabel lblNewLabel = new JLabel("Đăng nhập");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setBounds(170, 116, 156, 39);
		getContentPane().add(lblNewLabel);
		
		btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnDangNhap.setBackground(new Color(255, 0, 0));
	//	btnDangNhap.setBorder(new LineBorder(Color.WHITE, 2, true));
		btnDangNhap.setForeground(Color.WHITE);
		btnDangNhap.setBounds(166, 324, 176, 33);
		getContentPane().add(btnDangNhap);
		
		btnThoat = new JButton("Thoát");
		btnThoat.setForeground(Color.WHITE);
		btnThoat.setFont(new Font("SansSerif", Font.BOLD, 15));
	//	btnThoat.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		btnThoat.setBackground(new Color(255, 0, 0));
		btnThoat.setBounds(166, 368, 176, 33);
		getContentPane().add(btnThoat);
	}
	
	public void dangNhap() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnThoat))
			System.exit(0);
		if(o.equals(btnDangNhap))
			dangNhap();
		
	}
}
