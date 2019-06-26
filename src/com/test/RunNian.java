package com.test;

import java.util.Scanner;

public class RunNian {
    /*
    判断闰年的规则：
        1)能被4整除不能被100整除
        2)能被400整除
     */
    public static void main(String[] args) {
        System.out.println("请输入年份:");
        int year; //定义输入的年份
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        /**
         * 判断年份是否超出范围
         */
        if (year < 0 || year > 3000) {
            System.out.println("输入的年份有误，程序退出！！！");
            System.exit(0);
        }
        /**
         * 判断是否是闰年
         */
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
            System.out.println(year + "年是闰年");
        else
            System.out.println(year + "年不是闰年");


    }

}
