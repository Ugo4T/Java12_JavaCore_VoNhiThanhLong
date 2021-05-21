package cybersoft.javacore;

import java.util.Random;
import java.util.Scanner;

public class BT17 {
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
		Random rand = new Random();
        int ranNum = rand.nextInt(1000)+1;
        int play;
        do {
        	play = inputIntPositive("Input from 1 to 1000: ", "Wrong format");
        	if (play<ranNum)	System.out.println("Must input bigger"); else 
        	if (play>ranNum)    System.out.println("Must input smaller");
        } while (play!=ranNum);
        System.out.println("Bingo, this is: "+ranNum);
	}

}
