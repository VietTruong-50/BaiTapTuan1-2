package edu.tuan1;

public class BaiTap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, count1=0, count2=0, count3=0;
		
		for(int i=0; i<=100; i++) {
			if(i%5==0) count++;
			if(i%5==1) count1++;
			if(i%5==2) count2++;
			if(i%5==3) count3++;
		}
		System.out.print("\na. Chia hết cho 5: " + count + " số");
		System.out.print("\nb. Chia cho 5 dư 1: " + count1 + " số");
		System.out.print("\nc. Chia cho 5 dư 2: " + count2 + " số");
		System.out.print("\nd. Chia cho 5 dư 3: " + count3 + " số");
		System.out.println("\tTruong Quoc Viet 20198341");
	}
}