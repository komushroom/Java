package EnumExam;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;//����Ÿ�� ���� ����
		
		Calendar cal = Calendar.getInstance();//��(1)~��(7)������ ���ڷ� ����
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch (day){
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
			
		}
		System.out.println("���� ������" + today + "�Դϴ�");
		
		if(today == Week.SUNDAY) {
			System.out.println("PC�濡�� �ڵ��ϱ�");
		}
		else {
			System.out.println("�б��ǽ��ǿ��� ������ �ڹ��ڵ��ϱ�");
		}
}
}
