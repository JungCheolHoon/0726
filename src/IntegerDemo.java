
public class IntegerDemo {
	public static void main(String[] args) {
		System.out.printf("255의 10진수 : %d\n" , 255);
		System.out.println("255의 2진수 : "+ Integer.toBinaryString(255));
		System.out.printf("255의 8진수 : %o\n" , 255);
		System.out.printf("255의 16진수 : %x\n" , 255);
		
		System.out.println("------------------------------------------");
		
		System.out.printf("0b01110000의 10진수 : %d\n" , 0b01110000);
		System.out.println("0b01110000의 2진수 : "+ Integer.toBinaryString(0b01110000));
		System.out.printf("0b01110000의 8진수 : %o\n" , 0b01110000);
		System.out.printf("0b01110000의 16진수 : %x\n" , 0b01110000);
	
		System.out.println("------------------------------------------");
		
		System.out.printf("056의 10진수 : %d\n" , 056);
		System.out.println("056의 2진수 : "+ Integer.toBinaryString(056));
		System.out.printf("056의 8진수 : %o\n" , 056);
		System.out.printf("056의 16진수 : %x\n" , 056);
		
		System.out.println("------------------------------------------");
		
		System.out.printf("0xAB의 10진수 : %d\n" , 0xAB);
		System.out.println("0xAB의 2진수 : "+ Integer.toBinaryString(0xAB));
		System.out.printf("0xAB의 8진수 : %o\n" , 0xAB);
		System.out.printf("0xAB의 16진수 : %x\n" , 0xAB);
	
	
	
	}
}
