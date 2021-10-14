package edu.tuan1;

import java.util.Scanner;

public class BaiTap12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=0;
		System.out.println("Nhap chieu cao h: ");
		h = sc.nextInt();
		while(h<2 || h>10) {
		  System.out.println("Chieu cao (h) phai >=2 va <=10");
		  h = sc.nextInt();
		}
			  		  
		for(int i=0; i<=h; i++){
			for(int j=1; j<=h; j++){
			  	if(Math.abs(h-j)>=(i)){
			  		System.out.print(" * ");
			  	}
			  	else{System.out.print("  ");}
			}
				System.out.print("\n");
		}System.out.println("\tTruong Quoc Viet 20198341");
	}
}