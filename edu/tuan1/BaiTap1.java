package edu.tuan1;

public class BaiTap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		
		for(i=4; i<100; i++) {
			if(i>=4 && kTraSoNt(i)==0) {
				System.out.print(" " + i);
			}
		}System.out.println(" Truong Quoc Viet 20198341");
	}

	public static int kTraSoNt(int nt) {
		for(int i=2;i<=Math.sqrt(nt);i++) {
			if(nt%i==0) {return 0;}
		}
			if(nt<=1) return 0;	
			return 1;
}
} 
