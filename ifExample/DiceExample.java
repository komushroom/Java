package ifExample;

public class DiceExample {

	public static void main(String[] args) {
		// 조건문 - if문
		// Math.random() //0~1미만의 임의의 실수
		
		int num =(int)(Math.random() * 6)+1;//0.0~5.999999999999
		
		if(num == 1) {
			System.out.println("주사위의 값은 1입니다");
		}else if(num==2) {
			System.out.println("주사위의 값은 2입니다");
		}else if(num==3) {
			System.out.println("주사위의 값은 3입니다");
		}else if(num==4) {
			System.out.println("주사위의 값은 4입니다");
		}else if(num==5) {
			System.out.println("주사위의 값은 5입니다");
		}else{
			System.out.println("주사위의 값은 6입니다");
		}
	}

}
