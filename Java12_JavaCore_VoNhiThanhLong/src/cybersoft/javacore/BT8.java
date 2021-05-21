package cybersoft.javacore;

import java.util.Scanner;

public class BT8 {
	public static String inputString(String mess,String err1) {
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		do {
			System.out.print(mess); 
			result = sc.nextLine();
			if (result.length()!=0) check=1; else
				System.out.println(err1);
			
		}while (check==0);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = inputString("Input your string: ", "Not blank");
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
