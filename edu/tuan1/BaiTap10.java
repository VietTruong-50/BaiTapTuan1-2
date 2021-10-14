package edu.tuan1;

public class BaiTap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=30;
		
		for(int i=2; i<=N; i++) {
			if(N%i==0 && kTraSoNt(i)==1) {
				System.out.print(" " + i);
			}
		}System.out.println("\tTruong Quoc Viet 20198341");
	}
	
	public static int kTraSoNt(int nt) {
		for(int i=2;i<=Math.sqrt(nt);i++) {
			if(nt%i==0) {return 0;}
		}
			if(nt<=1) return 0;
			return 1;
	}
}
