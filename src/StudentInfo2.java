// 위에 class랑 무슨차이? main의 차이, 아래에서 선언한 class를 객체로 사용하려면 New 로 인스턴스화
public class StudentInfo2 {
	public static void main(String[] args) {
		Student chulsu = new Student();
		chulsu.name = "김철수";
		chulsu.hakbun = "2022-001";
		chulsu.kor = 80;
		chulsu.eng = 100;
		chulsu.mat = 85;
		
		int total = chulsu.kor + chulsu.eng + chulsu.mat;
		double avg = total / 3.;
		
		System.out.printf("총점 : %d\n" , total);
		System.out.println("총점 : " + avg);
	}
}

class Student{					//객체의 설계도
	String name;				//맴버,Field
	String hakbun;
	int kor;
	int eng;
	int mat;
}