package com.test;

import java.util.Scanner;

public class fangcheng {
    /*
    计算一元二次方程ax^2+bx+c=0的解
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        int i = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double dis = 0;
        do{
            i++;
            if(i>1){
                System.out.println("数值错误，请重新输入！");
            }
            System.out.println("请输入a的值：");
            a = scanner.nextDouble();
            System.out.println("请输入b的值：");
            b = scanner.nextDouble();
            System.out.println("请输入c的值：");
            c = scanner.nextDouble();

            double dis2 = b*b - 4*a*c;
            d = dis2;
                dis = Math.sqrt(b*b-4*a*c);

        }while (d<0);
        double x1 = (-1*b+dis)/(2*a);
        double x2 = (-1*b-dis)/(2*a);

        System.out.println(x1);
        System.out.println(x2);
    }

}
