package ifExample;

public class SwitchStringTest {

	public static void main(String[] args) {
		// ���ǹ� - switch ���ڿ� ���� ���
	String position = "����"
		
		switch(position) {
		case "����":
			System.out.println("������ 2500�����Դϴ�");
		case "����":
			System.out.println("������ 700�����Դϴ�");
		case "����":
			System.out.println("������ 500�����Դϴ�");
		default:
			System.out.println("������ 300�����Դϴ�");
		}
	}

}
