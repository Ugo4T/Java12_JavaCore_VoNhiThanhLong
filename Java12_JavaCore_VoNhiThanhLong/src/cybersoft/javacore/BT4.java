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
	public static int inputIntPositive(String mess, String err1) {// mess is reqs, err1 is err blank, err2 is err format
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		do {
			System.out.print(mess); 
			String str = sc.nextLine();
		
			try {
				result=Integer.parseInt(str);
				if (result>=0)check=1;
				else System.out.println("Must input number >=0 !");
				
			
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(err1);
			}
		}while (check==0);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int so = inputIntPositive("Input number: ", "Wrong format!");
		System.out.println("Result: "+sum(so));
	}

}
