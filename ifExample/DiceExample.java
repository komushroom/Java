package ifExample;

public class DiceExample {

	public static void main(String[] args) {
		// ���ǹ� - if��
		// Math.random() //0~1�̸��� ������ �Ǽ�
		
		int num =(int)(Math.random() * 6)+1;//0.0~5.999999999999
		
		if(num == 1) {
			System.out.println("�ֻ����� ���� 1�Դϴ�");
		}else if(num==2) {
			System.out.println("�ֻ����� ���� 2�Դϴ�");
		}else if(num==3) {
			System.out.println("�ֻ����� ���� 3�Դϴ�");
		}else if(num==4) {
			System.out.println("�ֻ����� ���� 4�Դϴ�");
		}else if(num==5) {
			System.out.println("�ֻ����� ���� 5�Դϴ�");
		}else{
			System.out.println("�ֻ����� ���� 6�Դϴ�");
		}
	}

}
