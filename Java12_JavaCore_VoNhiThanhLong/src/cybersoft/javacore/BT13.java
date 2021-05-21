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
		System.out.println("A: Average= "+ (double)sum/n);
		System.out.println("B: Max= "+max+" ; Min= "+min );
		
		if (maxNega!=Integer.MIN_VALUE) {
			System.out.println("C: Max negative= "+maxNega);
		}
		else System.out.println("C: Max negative: none");
		if (minNega!=Integer.MAX_VALUE) {
			System.out.println("Min nagative= "+minNega);
		}
		else System.out.println("Min nagative: none");
		
		if (maxPosi>0) {
			System.out.println("D: Max positive= "+maxPosi);
		}
		else System.out.println("D: Max positive: none");
		if (minPosi!=Integer.MAX_VALUE) {
			System.out.println("Min positive= "+minPosi);
		}
		else System.out.println("Min positive: none");
		String even="";
		String odd="";
		for (int i=0;i<n;i++) {
			if (arr[i]%2==0) even+=arr[i]+" ";
			if (arr[i]%2!=0) odd+=arr[i]+" ";
		}
		System.out.println("E: Even number: "+even);
		System.out.println("Odd number: "+odd);
		//=======
		int flat=0;
		int index;
		do {
			 index= inputIntPositive("F: Input position: ", "Wrong format");
			if (index>n) flat=0; else flat=1;
			System.out.println("index must < "+n);
		}while (flat==0);
		
		int num = inputInt("Input number want to add: ", "Wrong format");
		int[] newArr= new int[n+1];
		for (int i=0;i<index;i++) newArr[i]=arr[i];
		newArr[index]=num;
		for (int i=index+1;i<n+1;i++) newArr[i]=arr[i-1];
		System.out.print("New array: ");
		for (int i=0;i<n+1;i++) {
			
			System.out.print(newArr[i]+" ");
		}
		System.out.println();
		//=======
		
		do {
			 index= inputIntPositive("G: Input position: ", "Wrong format");
			if (index>n) flat=0; else flat=1;
			System.out.println("index must <= "+n);
		}while (flat==0);
		
		for (int i=index;i<n;i++) newArr[i]=newArr[i+1];
		System.out.print("New array: ");
		for (int i=0;i<n;i++) {
			
			System.out.print(newArr[i]+" ");
		}
		
	}

}
