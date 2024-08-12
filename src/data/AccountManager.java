
package data;

/**
 *
 * @author quang
 */
import java.io.*;
import java.util.*;

public class AccountManager {
    private static final String FILE_NAME = "Account.txt";
    private Map<String, Account> accounts = new HashMap<>();

    public AccountManager() {
        loadAccounts();
    }

    private void loadAccounts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    accounts.put(parts[0], new Account(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc file tài khoản.");
        }
    }

    private void saveAccounts() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Account account : accounts.values()) {
                writer.write(account.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Không thể lưu file tài khoản.");
        }
    }

    public void addAccount(String username, String password) {
        if (accounts.containsKey(username)) {
            System.out.println("Tài khoản đã tồn tại.");
            return;
        }
        accounts.put(username, new Account(username, password));
        saveAccounts();
        System.out.println("Thêm tài khoản thành công!");
    }

    public void deleteAccount(String username) {
        if (!accounts.containsKey(username)) {
            System.out.println("Tài khoản không tồn tại.");
            return;
        }
        accounts.remove(username);
        saveAccounts();
        System.out.println("Xóa tài khoản thành công!");
    }

    public void editAccount(String username, String newPassword) throws Exception {
        Account account = accounts.get(username);
        if (account == null) {
            System.out.println("Tài khoản không tồn tại.");
            return;
        }
        account.setPassword(newPassword);
        saveAccounts();
        System.out.println("Chỉnh sửa tài khoản thành công!");
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }
}

