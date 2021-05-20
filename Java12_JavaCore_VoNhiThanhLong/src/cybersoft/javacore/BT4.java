package cybersoft.javacore;

import java.util.Scanner;

public class BT4 {
	public static int sum(int so) {
		int result=0;
		while (so!=0) {
			result+=so%10;
			so/=10;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int so = Integer.parseInt(sc.nextLine());
		System.out.println("Ket qua: "+sum(so));
	}

}
