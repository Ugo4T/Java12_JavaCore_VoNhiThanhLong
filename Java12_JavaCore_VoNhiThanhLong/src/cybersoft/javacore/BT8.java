package cybersoft.javacore;

import java.util.Scanner;

public class BT8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your string: ");
		String str = sc.nextLine();
		String[] strs = str.split(" ");
		String firstLetter="";
		String anotherLetter="";
		String fullLetter="";
		System.out.print("Result: ");
		for (int i=0;i<strs.length;i++) {
			firstLetter=strs[i].substring(0, 1).toUpperCase();
			anotherLetter=strs[i].substring(1,strs[i].length());
			fullLetter=firstLetter+anotherLetter;
			System.out.print(fullLetter+" ");
		}
	}

}
