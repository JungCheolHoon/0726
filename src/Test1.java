import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		
		Student some = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요");	
		some.hakbun = sc.nextLine();
		System.out.println("이름을 입력하세요");
		some.name = sc.nextLine();
		System.out.println("국어점수를 입력하세요");
		some.kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		some.eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		some.mat = sc.nextInt();
		
		int total = some.kor + some.eng + some.mat;
		float avg = total/3f;
		
		System.out.println("학번 : " + some.hakbun );
		System.out.println("이름 : " + some.name );
		System.out.println("국어 : " + some.kor);
		System.out.println("영어 : " + some.eng);
		System.out.println("수학 : " + some.mat);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f" , avg);
		
		
	}
}
