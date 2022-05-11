
public class ForExample03 {

	public static void main(String[] args) {
		// 구구단
		for(int i=2; i<=9; i++) {
			System.out.printf("\n###%d단###\n",i);
			for(int j=1; j<=9; j++)
			System.out.printf("%d * %d = %d\n",i,j,j*i);
		}	

	}

}
