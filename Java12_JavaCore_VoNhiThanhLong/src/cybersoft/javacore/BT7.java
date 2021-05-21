package cybersoft.javacore;

import java.util.Scanner;

public class BT7 {
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
		System.out.print("Result is: ");
		
		for (int i=1;i<=so;i++) {
			if(so%i==0) System.out.print(i+" ");
		}
		if (so==0) System.out.println(1);
		
	}

}
