package cybersoft.javacore;

import java.util.Scanner;

public class BT15 {
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
	public static int inputIntPositive(String mess, String err1) {// mess is reqs, err1 is err blank, err2 is err format
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		do {
			System.out.print(mess); 
			String str = sc.nextLine();
		
			try {
				result=Integer.parseInt(str);
				if (result>0)check=1;
				else System.out.println("Must input positive number!");
				
			
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(err1);
			}
		}while (check==0);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = inputString("Input a string: ", "Not blank");
		System.out.println("Length of this string is: "+str.length());
		int check=0;
		int index;
		do {
			index = inputIntPositive("Input index: ", "Wrong format!");
			if (index<str.length()) check=1;else
		System.out.println("Index must < "+ str.length());
		}while (check==0);
		System.out.println("Char at "+index+" is "+str.charAt(index));
		System.out.print("Is this string contain abcdef: ");
		if (str.contains("abcdef")) System.out.println("yes"); else System.out.println("no");
	}

}
