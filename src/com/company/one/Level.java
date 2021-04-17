package com.company.one;

public class Level {
    public static void main(String[] args) {
        int user_level = 2;
        System.out.println("User level is " + user_level);
        int regular_user = 1;
        int admin = 2;
        int superadmin = 4;

        boolean res = user_level == regular_user;
        System.out.println("Regular user level:" + res);
        boolean res1 = user_level == admin;
        System.out.println("Admin user level:" + res1);
        boolean res2 = user_level == superadmin;
        System.out.println("Superadmin user level:" + res2);
    }
}
