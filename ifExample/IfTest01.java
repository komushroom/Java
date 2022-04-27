package ifExample;

public class IfTest01 {

	public static void main(String[] args) {
		// 조건문 - if
		int score = 96;
		
		if(score >=90) {
			System.out.printf("점수가%d점입니다\n",score);
			System.out.println("등급은 A입니다");
		}else if(score >=80) {
			System.out.printf("점수가%d점입니다\n",score);
			System.out.println("등급은 B입니다");
		}else if(score >=70) {
			System.out.printf("점수가%d점입니다\n",score);
			System.out.println("등급은 C입니다");
		}else if(score >=60) {
			System.out.printf("점수가%d점입니다\n",score);
			System.out.println("등급은 D입니다");
		}else{
			System.out.printf("점수가%d점입니다\n",score);
			System.out.println("등급은 E입니다");
		}
	}
}
