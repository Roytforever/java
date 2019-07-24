package com.T;

public class Digital {
    public static void main(String[] args) {
        int n=2;
        double num=1234.5645;
        for (int i=0;i<=n;i++){
            num*=10;
        }
        int num1=(int)num;
        num1+=5;
        num1/=10;
        double num2=(double)num1;

        System.out.println(num2);
        for (int i=0;i<n;i++){
            num2/=10;
        }

        System.out.println(num2);

    }
}
