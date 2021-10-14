package edu.tuan1;

public class BaiTap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb=0;
		for(numb=1000; numb<=2000; numb++) {
			if((numb%3==0) && (numb%5==0) && (numb%7==0)) {
				System.out.print(" " + numb);
			}
		}System.out.println("\tTruong Quoc Viet 20198341");
	}
} 
