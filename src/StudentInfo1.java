import java.util.Scanner;

public class StudentInfo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("귀하의 키는 : ");
		double height = sc.nextDouble();
		
		System.out.print("귀하의 몸무게 : ");
		double weight = sc.nextDouble();
		
		System.out.println("키와 몸무게 : " + height + "cm, " + weight + "kg");
		
		System.out.print("귀하의 키는 : ");
		height = sc.nextDouble();
		
		System.out.print("귀하의 몸무게 : ");
		weight = sc.nextDouble();
		
	}
}
