package ifExample;

public class SwitchTest02 {

	public static void main(String[] args) {
		// 조건문 - switch
		int time = (int)(Math.random()*4)+8;
		
		switch(time) {
		case 8:
			System.out.println("[현재시간:"+time+"시");
			
		case 9:
			System.out.println("[현재시간:"+time+"시");
		case 10:
			System.out.println("[현재시간:"+time+"시");
		default:
			System.out.println("[현재시간:"+time+"시");
		}
		
	}

}
