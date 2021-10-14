package edu.tuan1;

import java.lang.Math;

public class BaiTap6 {

	public static void main(String[] args) {
		int p=2;
		int count = 0;
do {
	if(kTraSoNt(p)==1) {
		if(p!=11) {
			System.out.print(" " + (int)(Math.pow(2,p-1)*(Math.pow(2,p)-1)));
			count++;}
		}
		if(count==5) break;
		p++;
		}while(count>0);
		System.out.println("\tTruong Quoc Viet 20198341");
	}
	
	public static int kTraSoNt(int nt) {
		for(int i=2;i<=Math.sqrt(nt);i++) {
			if(nt%i==0) {return 0;}
		}
			if(nt<=1) return 0;
			return 1;
	}
}
