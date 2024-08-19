package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AccountManagementTest.AccountManagement_Main;
import Controller.EditAccountListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import java.awt.Color;

public class AccountManagement_EditAccount extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField usernameTextField;
    private JButton confirmButton;
    private JButton cancelButton;
    private JLabel suaThongTinTaiKhoanText;
    private JLabel lblNewLabel_1;
    private JTextField newPasswordTextField;
    private AccountManagement_Main amm;

    public AccountManagement_EditAccount() {
    	this.amm = new AccountManagement_Main();
		this.init();
		setVisible(true);
	}

	public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1076, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 91, 1062, 472);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        usernameTextField = new JTextField();
        usernameTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        usernameTextField.setBounds(393, 47, 285, 30);
        panel_2.add(usernameTextField);
        usernameTextField.setColumns(10);
        
        JLabel nhapTenTaiKhoanText = new JLabel("Nhập tên tài khoản cần sửa");
        nhapTenTaiKhoanText.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        nhapTenTaiKhoanText.setBounds(392, 11, 278, 30);
        panel_2.add(nhapTenTaiKhoanText);
        
        confirmButton = new JButton("Xác nhận");
        ActionListener ac = new EditAccountListener(this);
        confirmButton.addActionListener(ac);
        confirmButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		confirmButton.setBackground(new Color(100, 181, 246));
        		confirmButton.setForeground(Color.BLACK);
        	}
        	
        	 @Override
             public void mouseExited(MouseEvent e) {
        		 confirmButton.setBackground(Color.WHITE);
        		 confirmButton.setForeground(Color.BLACK);
             }
        });
        confirmButton.setBackground(new Color(255, 255, 255));
        confirmButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
        confirmButton.setBounds(393, 410, 134, 41);
        panel_2.add(confirmButton);
        
        cancelButton = new JButton("Hủy bỏ");
        cancelButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		cancelButton.setBackground(new Color(255, 61, 0));
        		cancelButton.setForeground(Color.BLACK);
        	}
        	
        	 @Override
             public void mouseExited(MouseEvent e) {
        		 cancelButton.setBackground(Color.WHITE);
        		 cancelButton.setForeground(Color.BLACK);
             }
        	 
        	 @Override
             public void mouseClicked(MouseEvent e) {
                 usernameTextField.setText("");
                 newPasswordTextField.setText("");
             }
        });
        cancelButton.setBackground(new Color(255, 255, 255));
        cancelButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
        cancelButton.setBounds(555, 410, 125, 41);
        panel_2.add(cancelButton);
        
        lblNewLabel_1 = new JLabel("Mật khẩu mới");
        lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(393, 87, 278, 30);
        panel_2.add(lblNewLabel_1);
        
        newPasswordTextField = new JTextField();
        newPasswordTextField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        newPasswordTextField.setColumns(10);
        newPasswordTextField.setBounds(393, 127, 285, 30);
        panel_2.add(newPasswordTextField);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(25, 118, 210));
        panel_1.setBounds(0, 0, 1062, 92);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JButton backButton = new JButton("Quay lại");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	AccountManagement_View newFrame = new AccountManagement_View();
                newFrame.setVisible(true);
                dispose();
            }
        });
        backButton.setBackground(new Color(255, 255, 255));
        backButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		backButton.setBackground(new Color(100, 181, 246));
        		backButton.setForeground(Color.BLACK);
        	}
        	
        	 @Override
             public void mouseExited(MouseEvent e) {
        		 backButton.setBackground(Color.WHITE);
        		 backButton.setForeground(Color.BLACK);
             }
        });
        backButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        backButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        backButton.setBounds(0, 0, 100, 37);
        panel_1.add(backButton);
        
        suaThongTinTaiKhoanText = new JLabel("SỬA THÔNG TIN TÀI KHOẢN");
        suaThongTinTaiKhoanText.setForeground(new Color(255, 255, 255));
        suaThongTinTaiKhoanText.setFont(new Font("Segoe UI", Font.BOLD, 20));
        suaThongTinTaiKhoanText.setBounds(390, 21, 296, 61);
        panel_1.add(suaThongTinTaiKhoanText);
        
    }
	
	public void edit_account() {
		String username = usernameTextField.getText();
        String password = newPasswordTextField.getText();
        if (username.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Vui lòng nhập  hết các trường dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    if (password.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Vui lòng nhập  hết các trường dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
		int res = amm.editAccount(username, password);		/* lưu ý: code các chức năng lúc đầu cần phải sửa đổi để phù hợp 
														với cách chạy thông qua giao diện thay vì màn hình console */
		if (res == 2) {
			JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (res == 1) {
			JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
		else if (res == 3) {
			JOptionPane.showMessageDialog(this, "Vui lòng nhập  hết các trường dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
		else if (res == 4) {
	        JOptionPane.showMessageDialog(this, "Vui lòng nhập  hết các trường dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	    }
	}
}
