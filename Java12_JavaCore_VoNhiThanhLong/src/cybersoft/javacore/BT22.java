package cybersoft.javacore;

import java.util.Scanner;

public class BT22 {
	public static String inputString(String mess,String err1) {
		String result = "";
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		do {
			System.out.print(mess); 
			result = sc.nextLine();
			if (result.length()!=0) check=1; else
				System.out.println(err1);
			
		}while (check==0);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= inputString("Input string: ", "Not blank!");
		int save=0;
		int result=0;
		int max = 0;
		for (int i=0;i<str.length()-1;i++) {
			if (str.charAt(i)==str.charAt(i+1)) {
				save = i;
				int count=0;
				
				while (str.charAt(save-count)==str.charAt(save+1+count)) {
					count++;
					if (count>i||i+count+1>=str.length()) break;
					
				}
				if (count>max) {
					max=count;
					result=save;
				}
				
			}
			
		}
		System.out.print("Sub string palindromic longest is: ");
		for (int i=result+1;i<result+max+1;i++) {
			System.out.print(str.charAt(i));
		}
		
	}

}
