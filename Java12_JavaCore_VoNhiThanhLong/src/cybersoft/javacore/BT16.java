package cybersoft.javacore;

import java.util.Scanner;

public class BT16 {
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
	public static boolean checkYear(int year) {
		if (year % 400 == 0) {
            return true;
        } else {
            if (year % 100 == 0) {
                return false;
            } else {
                if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
	}
	public static void main(String[] args) {
		int year = inputIntPositive("Input positive number: ", "Wrong");
		if (checkYear(year)) {
			System.out.println("Nam nhuan");
		} else {
			System.out.println("Nam khong nhuan");
		}
	}
	

}
