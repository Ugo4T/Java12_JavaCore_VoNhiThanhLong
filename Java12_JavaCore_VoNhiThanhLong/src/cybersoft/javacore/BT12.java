package cybersoft.javacore;

import java.util.Scanner;

public class BT12 {
	public static int inputInt(String mess, String err1) {// mess is reqs, err1 is err blank, err2 is err format
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		do {
			System.out.print(mess); 
			String str = sc.nextLine();
		
			try {
				result=Integer.parseInt(str);
				if (result>1)check=1;
				else System.out.println("Input number bigger than 0 ");
				
			
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(err1);
			}
		}while (check==0);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputInt("Input positive number: ", "Wrong format!");
		String result="";
		for (int i=1;i<=n;i++) {
			result+=i;
			System.out.println(result);
		}
	}

}
