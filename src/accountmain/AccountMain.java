
package accountmain;

import data.Account;
import data.AccountManager;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author quang
 */
public class AccountMain {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Chọn chức năng:");
                System.out.println("1. Đăng ký");
                System.out.println("2. Đăng nhập");
                System.out.println("3. Quản lý tài khoản");
                System.out.println("4. Thoát");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
                
                switch (choice) {
                    case 1:
                        Account acc1 = new Account();
                        acc1.nhap();
                        Account.register(accountManager.getAccounts(), acc1.getUsername(), acc1.getPassword());
                        break;
                    case 2:
                        Account acc2 = new Account();
                        acc2.nhap();
                        Account.login(accountManager.getAccounts(), acc2.getUsername(), acc2.getPassword());
                        break;
                    case 3:
                        manageAccounts(scanner, accountManager);
                        break;
                    case 4:
                        System.out.println("Thoát chương trình.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }
            } catch (Exception ex) {
                Logger.getLogger(AccountMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    private static void manageAccounts(Scanner scanner, AccountManager accountManager) throws Exception {
        System.out.println("Chọn chức năng:");
        System.out.println("1. Thêm tài khoản");
        System.out.println("2. Xóa tài khoản");
        System.out.println("3. Chỉnh sửa tài khoản");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                Account acc3 = new Account();
                acc3.nhap();
                accountManager.addAccount(acc3.getUsername(), acc3.getPassword());
                break;
            case 2:
                System.out.print("Nhập tên tài khoản cần xóa: ");
                String deleteUsername = scanner.nextLine();
                accountManager.deleteAccount(deleteUsername);
                break;
            case 3:
                System.out.print("Nhập tên tài khoản cần chỉnh sửa: ");
                String editUsername = scanner.nextLine();
                System.out.print("Nhập mật khẩu mới: ");
                String newPassword = scanner.nextLine();
                accountManager.editAccount(editUsername, newPassword);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }
}
    

