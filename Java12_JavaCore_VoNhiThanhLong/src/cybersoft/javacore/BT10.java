package cybersoft.javacore;

import java.util.Scanner;

public class BT10 {
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
	public static boolean isPrime(int n) {
		if (n<2) return false;
		for (int i=2;i<n-1;i++) {
			if (n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = inputInt("Input integer: ", "Wrong format!");
		int sum=0;
		for (int i=2;i<=n;i++) {
			if(isPrime(i)==true ) {
				sum+=i;
			}
		}
		System.out.println("Result is: "+sum);
	}

}
