package EnumExam;

public class EnumPersonTest {
	public static void who(Person man) {
		switch(man) {
			case MAN:
				System.out.println("남성");
				break;
			case WOMAN:
				System.out.println("여성");
				break;
		}
	}
	public static void main(String[] args) {
		who(Person.WOMAN);

	}

}
