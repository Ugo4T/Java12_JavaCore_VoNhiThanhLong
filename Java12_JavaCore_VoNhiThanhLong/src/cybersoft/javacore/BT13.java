package cybersoft.javacore;

import java.util.Scanner;

public class BT13 {
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
				else System.out.println("Input positive number");
				
			
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
		int n = inputIntPositive("Input positive number: ", "Wrong format!");
		int[] arr = new int[n];
		int sum=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int maxNega=Integer.MIN_VALUE;
		int minNega=Integer.MAX_VALUE;
		int maxPosi=Integer.MIN_VALUE;
		int minPosi=Integer.MAX_VALUE;
		
		for (int i=0;i<n;i++) {
			arr[i]=inputInt("Input arr[" +i+"]: ", "Wrong format!");
			sum+=arr[i];
			
			if (max<arr[i]) max=arr[i];
			if (min>arr[i]) min=arr[i];
			if (maxPosi<arr[i] && arr[i]>0) maxPosi=arr[i];
			if (minPosi>arr[i] && arr[i]>0) minPosi=arr[i];
			if (maxNega<arr[i] && arr[i]<0) maxNega=arr[i];
			if (minNega>arr[i] && arr[i]<0) minNega=arr[i];
			
		}
		System.out.println("A: "+ sum/n);
		System.out.println("B: max= "+max+" ; min= "+min );
		System.out.println("C: max negattive= "+maxNega+" ; min negative= "+minNega );
		System.out.println("D: max positive= "+maxPosi+" ; min positive= "+minPosi );
		
	}

}
