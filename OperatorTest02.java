package operator;

public class OperatorTest02 {

	public static void main(String[] args) {
	 // �������� && & || |
		
		int charCode = 'A';
		int num1 = 3;
		int num2= 5;
				
		boolean result1 = (num1 > num2) & (num1 == num2);
		System.out.println(result1);
		
		int value = 8;
		
		if((value % 2 == 0)&(value % 3 ==0)) {
			System.out.println("2�� ����̸� 3�� ����Դϴ�");
		}
		
		if((value % 3== 0)&&(value % 2 ==0)) {
			System.out.println("2�� ����̸� 3�� ����Դϴ�");
			
		}
		if((value % 3== 0)|(value % 2 ==0)) {
			System.out.println("2�� ����̸� 3�ǹ���Դϴ�")	;
		}
		if((value % 3== 0)||(value % 2 ==0)) {
			System.out.println("2�� ����̸� 3�ǹ���Դϴ�")	;
		}
	}
}
