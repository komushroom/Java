package operator;

public class OperatorTest01 {

	public static void main(String[] args) {
		//비교연산자 동등 == !=  크기 > < >= <=
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		System.out.println(result1);
		
		boolean result2 = (num1 != num2);
		System.out.println(result2);
		
		boolean result3 = (num1 > num2);
		System.out.println(result3);
		
		char char1 ='A';//65
		char char2 ='B';//66
		boolean result4 = (char1 < char2);
		System.out.println(result4);
		
		
	}

}
