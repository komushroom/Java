package EnumExam;

public class EnumPersonTest {
	public static void who(Person man) {
		switch(man) {
			case MAN:
				System.out.println("����");
				break;
			case WOMAN:
				System.out.println("����");
				break;
		}
	}
	public static void main(String[] args) {
		who(Person.WOMAN);

	}

}
