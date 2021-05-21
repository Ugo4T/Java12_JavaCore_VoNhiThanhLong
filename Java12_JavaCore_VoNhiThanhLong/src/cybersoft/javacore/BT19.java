package cybersoft.javacore;

import java.util.Scanner;

public class BT19 {
	public static double inputDoublePositive(String mess, String err1) {// mess is reqs, err1 is err blank, err2 is err format
		double result = 0;
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		do {
			System.out.print(mess); 
			String str = sc.nextLine();
		
			try {
				result=Double.parseDouble(str);
				check =1;
				
			
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(err1);
			}
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
				if (result>0&&result<=1000)check=1;
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
		System.out.println("====== Program calculate ======");
		System.out.println("1. ax + b = 0");
		System.out.println("2. ax^2 + bx + c = 0");
		int choice ;
		
		do {
			choice= inputIntPositive("Input your choice (1 or 2): ", "Wrong format!");
		
		} while(choice >2);
		double a;
		double b;
		double c;
		switch (choice) {
		case 1:
			a= inputDoublePositive("Input a: ", "Wrong format");
			b =  inputDoublePositive("Input b: ", "Wrong format");
			System.out.println((double)-b/a);
			break;

		default:
			a = inputDoublePositive("Input a: ", "Wrong format");
			b = inputDoublePositive("Input b: ", "Wrong format");
			c = inputDoublePositive("Input c: ", "Wrong format");
			if (b*b-4*a*c<0) System.out.println("Phương trình vô nghiệm");
			else if (b*b-4*a*c==0) {
				System.out.println("Phương trình có một nghiệm duy nhất là:" +((-b)/(2*a)));
			} else {
				System.out.println("Nghiệm thứ 1 là:" +((-b+Math.sqrt(b*b-4*a*c))/(2*a)));
				System.out.println("Nghiệm thứ 2 là:" +((-b-Math.sqrt(b*b-4*a*c))/(2*a)));
			}
			break;
		}
	}

}
