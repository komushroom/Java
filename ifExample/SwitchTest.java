package ifExample;

public class SwitchTest {

	public static void main(String[] args) {
		// ���ǹ� - switch��
		int num = (int)(Math.random() * 6)+1;
		
		switch(num) {
		case 1:
			System.out.println("�ֻ��� ���� 1�Դϴ�");
			break;
		case 2:
			System.out.println("�ֻ��� ���� 2�Դϴ�");
			break;
		case 3:
			System.out.println("�ֻ��� ���� 3�Դϴ�");
			break;
		case 4:
			System.out.println("�ֻ��� ���� 4�Դϴ�");
			break;
		case 5:
			System.out.println("�ֻ��� ���� 5�Դϴ�");
			break;
		default:
			System.out.println("�ֻ��� ���� 6�Դϴ�");
		}

	}

}
