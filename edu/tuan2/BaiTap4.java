package edu.tuan2;

import java.util.Scanner;

public class BaiTap4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập N: ");
	       	int n= sc.nextInt();
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }System.out.println(" Truong Quoc Viet 20198341");	
	}
	       
	public static int fibonacci(int n) {
        int x0 = 0, x1 = 1, xn = 1;
 
        if (n < 0) {return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                x0 = x1;
                x1 = xn;
                xn = x0 + x1;
            }}
        return xn;
    }
}