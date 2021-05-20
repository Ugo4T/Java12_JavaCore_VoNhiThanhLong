package cybersoft.javacore;

import java.util.Scanner;

public class BT5 {
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
		
		System.out.println("Nhap toa do cua A: ");
		System.out.print("X1= ");
		int x1 = Integer.parseInt(sc.nextLine());
		System.out.print("Y1= ");
		int y1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap toa do cua B: ");
		System.out.print("X2= ");
		int x2 = Integer.parseInt(sc.nextLine());
		System.out.print("Y2= ");
		int y2 = Integer.parseInt(sc.nextLine());
		
		double result = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		System.out.println("Ket qua: "+result);
	}
}
