package edu.tuan1;

public class BaiTap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nt = 1000;
		while(nt<=2000) {
				if(kTraSoNt(nt)==1) {
					System.out.print(" "+nt);
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