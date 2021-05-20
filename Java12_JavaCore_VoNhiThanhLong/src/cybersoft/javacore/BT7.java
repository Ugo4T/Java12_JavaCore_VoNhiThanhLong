package cybersoft.javacore;

import java.util.Scanner;

public class BT7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your number: ");
		int so = Integer.parseInt(sc.nextLine()) ;
		System.out.print("Result is: ");
		for (int i=1;i<=so;i++) {
			if(so%i==0) System.out.print(i+" ");
		}
		
	}

}
