package edu.tuan1;

public class BaiTap9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 12;
		
		for(int i=2; i<=N; i++) {
			while(N%i==0 && kTraSoNt(i)==1) {
				System.out.print(" " + i);
				N/=i;
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