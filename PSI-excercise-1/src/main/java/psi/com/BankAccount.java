package psi.com;

/*
Bài 4: Quản lý tài khoản ngân hàng
Tạo lớp BankAccount với các thuộc tính:
accountNumber (số tài khoản).
balance (số dư).
Cung cấp phương thức:
deposit(double amount): Nạp tiền vào tài khoản (nếu số tiền > 0).
withdraw(double amount): Rút tiền (nếu đủ số dư).
Viết chương trình:
Tạo một tài khoản ngân hàng.
Nạp tiền, rút tiền, và hiển thị số dư hiện tại.
Gợi ý:
 */

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien nap khong hop le");
        }
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("Số dư không đủ!");
        }
    }

    public void showBalance() {
        System.out.println("So du hien tai: " + balance);
    }

    public static class Main {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("123456789");

            //hien thi tk
            account.showBalance();

            //nap tien vao tk
            account.deposit(500);
            System.out.println("Nap 500 vao tai khoan.");
            account.showBalance();

            //rut tien hop le
            account.withdraw(200);
            System.out.println("Rut 200 vao tai khoan.");
            account.showBalance();


            //rut tien vuot qua muc du
            account.withdraw(300);
            System.out.println("Thu rut 300 tu tk");
            account.showBalance();
        }
    }
}
