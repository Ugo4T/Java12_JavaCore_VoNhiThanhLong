package cybersoft.javacore;

import java.util.Scanner;

public class BT21 {
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
		int firstKanX,secondKanX;
		int firstKanV,secondKanV;
		do {
			firstKanX = inputIntPositive("Input x1: ", "Wrong format!");
			
		} while (firstKanX>10000);
		do {
			firstKanV = inputIntPositive("Input v1: ", "Wrong format!");
			
		} while (firstKanV<1||firstKanV>10000);
		do {
			secondKanX = inputIntPositive("Input x2: ", "Wrong format!");
			
		} while (secondKanX>10000);
		do {
			secondKanV = inputIntPositive("Input v2: ", "Wrong format!");
			
		} while (secondKanV<1||secondKanV>10000);
		
		double result = (double)(secondKanX-firstKanX)/(firstKanV-secondKanV);
		if (result %1==0&&result>0) {
			System.out.println("Meet");
	
		}
		else {
			
			System.out.println("No");
		}
	}

}
