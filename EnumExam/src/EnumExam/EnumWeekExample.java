package EnumExam;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;//열거타입 변수 선언
		
		Calendar cal = Calendar.getInstance();//일(1)~토(7)까지의 숫자로 리턴
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
		System.out.println("오늘 요일은" + today + "입니다");
		
		if(today == Week.SUNDAY) {
			System.out.println("PC방에서 코딩하기");
		}
		else {
			System.out.println("학교실습실에서 열심히 자바코딩하기");
		}
}
}
