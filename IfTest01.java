
public class IfTest01 {

	public static void main(String[] args) {
		// if문 {}있을때와 없을때의 차이점
		
		int score = 73;
		if(score>=90) {
			System.out.println("점수가 90점보다 큽니다");
			System.out.println("등급이A입니다");
		}
		if(score < 90)
			System.out.println("점수가 90점보다 작습니다");
		System.out.println("등급이 B입니다"); 
	}

}
