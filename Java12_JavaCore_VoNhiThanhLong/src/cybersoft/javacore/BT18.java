package cybersoft.javacore;

import java.util.Scanner;

public class BT18 {
	
	public static double inputDoublePositive(String mess, String err1) {// mess is reqs, err1 is err blank, err2 is err format
		double result = 0;
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		do {
			System.out.print(mess); 
			String str = sc.nextLine();
		
			try {
				result=Double.parseDouble(str);
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
		
		
		double money= inputDoublePositive("Input your money: ", "Wrong format!");
		
		double desire = 	 inputDoublePositive("Input money you want: ", "Wrong format!");
		
		double rate = inputDoublePositive("Input interest rate: ", "Wrong format!");
		int year=0;
		while (money<desire) {
			year++;
			money=money*(1+rate);
		}
		System.out.println("It be: "+ year+" year");
	}

}
