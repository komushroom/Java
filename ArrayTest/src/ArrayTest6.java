
public class ArrayTest6 {

	public static void main(String[] args) {
		// �ζǹ�ȣ ������
		int[] lotto = new int[45];//�迭���� lotto���� 45���� ũ��
		int temp =0, j =0;
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = i+1 ;
			//System.out.println(lotto[i]);
		}
		for(int i = 0; i<100; i++) {
			
			j =(int)(Math.random() *45); //0~44 ������ ��ȯ
			temp= lotto[0];
			lotto[0] = lotto[j];
			lotto[j] = temp;
			
		}
		for(int i =0; i<6; i++) {
			System.out.println(lotto[i]);
	}

}
}
