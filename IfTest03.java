
public class IfTest03 {

	public static void main(String[] args) {
		// if~else if~else문
		int score =75;
		
		if(score>=90) {
			System.out.printf("점수가%d점보다 입니다\n",score);
			System.out.println("등급은 A입니다");
		}else if(score >=80){
			System.out.printf("점수가%d점보다 입니다\n",score);
			System.out.println("등급은 B입니다");
		}else if(score >=70){
			System.out.printf("점수가 %d점보다 입니다\n",score);
			System.out.println("등급은 C입니다");
		}else if(score >=60){
			System.out.printf("점수가 %d점보다 입니다\n",score);
			System.out.println("등급은 D입니다");
		}else{
			System.out.printf("점수가 %d점보다 입니다\n",score);
			System.out.println("등급은 F입니다");
		}
		System.out.println("종료");
	}

}
