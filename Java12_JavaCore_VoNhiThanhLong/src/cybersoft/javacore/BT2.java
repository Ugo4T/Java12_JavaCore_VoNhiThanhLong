package cybersoft.javacore;

import java.util.Scanner;

public class BT2 {
	
	public static String change10to2(int so) {
		String result ="";
		int du=0;
		while(so!=0) {
			du=so%2;
			result=du+result;
			so=so/2;
		}
		return result;
	}
	public static int mu (int coso, int somu) {
		int result=1;
		for (int i=0;i<somu;i++) {
			result*=coso;
		}
		return result;
	}
	public static int change2to10(String so) {
		int result=0;
		int index=0;
		for (int i=so.length()-1;i>=0;i--) {
		
			index=Integer.parseInt(so.charAt(i)+"");
			result+=index*mu(2,so.length()-i-1);
		}
		//0*2*10^0+1*2*10^1
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("**** Chương trình đổi số *****");
		System.out.println("1. Đổi hệ 10 sang hệ 2");
		System.out.println("2. Đổi hệ 2 sang hệ 10");
		System.out.print("Lựa chọn của bạn: ");
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		case 1: 
				System.out.print("Nhập hệ 10: ");
				int so10 = Integer.parseInt(sc.nextLine());
				System.out.println("Hệ 2 là: "+change10to2(so10));
				break;
		case 2: 
			System.out.print("Nhập hệ 2: ");
			String so2 = sc.nextLine();
			System.out.println("Hệ 2 là: "+change2to10(so2));
			break;
		
		}
	}

}
