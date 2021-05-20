package cybersoft.javacore;

import java.util.Scanner;

public class BT9 {
	public static int inputInt(String mess, String err1) {// mess is reqs, err1 is err blank, err2 is err format
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		do {
			System.out.print(mess); 
			String str = sc.nextLine();
		
			try {
				result=Integer.parseInt(str);
				check=1;
			
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(err1);
			}
		}while (check==0);
		return result;
	}
	
	public static String inputString(String mess,String err1) {
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		do {
			System.out.println(mess); 
			String str = sc.nextLine();
			if (str.length()!=0) check=1; else
				System.out.println(err1);
			
		}while (check==0);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int so1 = inputInt("Input first number(10...99): ", "Input wrong format");
		if (so1<10 || so1 >99) {
			 so1 = inputInt("Input first number(10...99): ", "Input wrong format");
		}
		int so2 = inputInt("Input second number(10...99): ", "Input wrong format");
		if (so2<10 || so2 >99) {
			 so2 = inputInt("Input second number(10...99): ", "Input wrong format");
		}
		if (so1/10 == so2/10 ||so1/10 == so2%10 || so1%10 == so2/10 || so1%10==so2%10) {
			System.out.println("Result is true");
		} else System.out.println("Result is false");
	}

}
