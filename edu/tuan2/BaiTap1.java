package edu.tuan2;

import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		System.out.println("Nhập vào số n: ");
		int n=sc.nextInt();
		
		double sum1=0 , sum2=0;
		for(i=1;i<=n;i++) {
			sum1 +=i;
			sum2 += 1/sum1;  
		}
		System.out.println(sum2);
		
	
		System.out.println(" Truong Quoc Viet 20198341");
		
	}
}
