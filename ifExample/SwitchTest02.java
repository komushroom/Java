package ifExample;

public class SwitchTest02 {

	public static void main(String[] args) {
		// ���ǹ� - switch
		int time = (int)(Math.random()*4)+8;
		
		switch(time) {
		case 8:
			System.out.println("[����ð�:"+time+"��");
			
		case 9:
			System.out.println("[����ð�:"+time+"��");
		case 10:
			System.out.println("[����ð�:"+time+"��");
		default:
			System.out.println("[����ð�:"+time+"��");
		}
		
	}

}
