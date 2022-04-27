package ifExample;

public class SwitchStringTest {

	public static void main(String[] args) {
		// 조건문 - switch 문자열 변수 사용
	String position = "사장"
		
		switch(position) {
		case "사장":
			System.out.println("월급은 2500만원입니다");
		case "부장":
			System.out.println("월급은 700만원입니다");
		case "과장":
			System.out.println("월급은 500만원입니다");
		default:
			System.out.println("월급은 300만원입니다");
		}
	}

}
