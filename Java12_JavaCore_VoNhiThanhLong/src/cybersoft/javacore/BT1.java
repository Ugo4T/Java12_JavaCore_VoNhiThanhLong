package cybersoft.javacore;

public class BT1 {
	
	public static void printD() {
		System.out.println("* * * * * * ==================================");
	}
	public static void printN() {
		System.out.println(" * * * * *  ==================================");
	}
	public static void printB() {
		System.out.println("==============================================");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			printD();
			printN();
			
		}
		printD();
		for(int i=0; i<6;i++) {
			printB();
		}
	}

}
