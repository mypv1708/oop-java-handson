package com.advance.ExercisesOnClasses.Ex2.Ex2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1001, "Nguyen Van A", 'm');
        Account account1 = new Account(1, customer1, 100.50);
        System.out.println(account1);

        account1.deposit(50.25);
        System.out.println("Tài khoản sau khi nạp tiền: " + account1);

        account1.withdraw(200.00);
        System.out.println("Tài khoản sau khi cố gắng rút tiền quá số dư: " + account1);

        account1.withdraw(75.00);
        System.out.println("Tài khoản sau khi rút tiền: " + account1);

        System.out.println("Tên khách hàng của tài khoản: " + account1.getCustomerName());

        Account account2 = new Account(2, new Customer(1002, "Tran Thi B", 'f'));
        System.out.println("Tài khoản mới: " + account2);
        account2.deposit(1000.00);
        System.out.println("Tài khoản mới sau khi nạp tiền: " + account2);
    }
}
