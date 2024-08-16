package data;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author quang
 */
public class Account {

    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account() {
    }
    
    

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if (password.isEmpty()) {
            throw new Exception("Mật khẩu không được để trống!");
        } else {
            this.password = password;
        }
    }

    public void setUsername(String username) throws Exception {
        if (username.isEmpty()) {
            throw new Exception("Tài khoản không được để trống!");
        } else {
            this.username = username;
        }
    }

    public void nhap() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập tên tài khoản: ");
                setUsername(sc.nextLine());
                System.out.print("Nhập mật khẩu: ");
                setPassword(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.toString());;
            }

        }

    }

    @Override
    public String toString() {
        return username + "," + password;
    }

    // Static methods to handle registration and login
    public static boolean register(Map<String, Account> accounts, String username, String password) {
        if (accounts.containsKey(username)) {
            return false;
        } else {
            accounts.put(username, new Account(username, password));
            return true;
        }
    }

    public static boolean login(Map<String, Account> accounts, String username, String password) {
        Account account = accounts.get(username);
        if (account == null) {
            System.out.println("Tài khoản không tồn tại.");
            return false;
        }
        if (account.getPassword().equals(password)) {
            System.out.println("Đăng nhập thành công!");
            return true;
        } else {
            System.out.println("Mật khẩu không chính xác.");
            return false;
        }
    }
}
