package cybersoft.javacore;

import java.util.HashMap;
import java.util.Scanner;

public class BT14 {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputIntPositive("Input size of Array: ", "Wrong format!");
		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		for (int i=0;i<n;i++) {
			list.put(inputInt("Input list ["+i+"]: ", "Wrong format!"), 1);
		}
		System.out.println("Result: ");
		for(int i:list.keySet()) {
			System.out.print(i+" ");
		}
	}

}
