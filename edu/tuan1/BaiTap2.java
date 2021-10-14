package edu.tuan1;

public class BaiTap2 {
	public static void main(String[] args) {
		int nt = 0;
		int count = 0;

		while(count<20) {
			if(kTraSoNt(nt)==1) {
				System.out.print(" "+ nt);
				count++;
			}
			nt++;
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
