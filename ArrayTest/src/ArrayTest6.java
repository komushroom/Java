
public class ArrayTest6 {

	public static void main(String[] args) {
		// 로또번호 생성기
		int[] lotto = new int[45];//배열변수 lotto생성 45개의 크기
		int temp =0, j =0;
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = i+1 ;
			//System.out.println(lotto[i]);
		}
		for(int i = 0; i<100; i++) {
			
			j =(int)(Math.random() *45); //0~44 정수값 반환
			temp= lotto[0];
			lotto[0] = lotto[j];
			lotto[j] = temp;
			
		}
		for(int i =0; i<6; i++) {
			System.out.println(lotto[i]);
	}

}
}
