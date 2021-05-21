package cybersoft.javacore;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BT20 {
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
		int n = inputIntPositive("Input number of array: ", "Wrong format!");
		int [] arr = new int[n];
		ArrayList<Integer> arrEven = new ArrayList<Integer>();
		ArrayList<Integer> arrOdd = new ArrayList<Integer>();
		for (int i=0;i<n;i++) {			
			arr[i]=inputInt("Input arr[" +i+"]: ", "Wrong format!");	
			if (arr[i]%2==0) arrEven.add(arr[i]);
			else arrOdd.add(arr[i]);
		}
		System.out.println("Even array: "+arrEven.toString());
		System.out.println("Odd array: "+arrOdd.toString());
	}

}
