package cybersoft.javacore;

import java.util.Scanner;

public class BT6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your string: ");
		String str = sc.nextLine();
		String xd="";
		for (int i=0;i<str.length();i++) {
			xd=str.charAt(i)+xd;
		};
		System.out.println("Result is: "+xd);
	}

}
