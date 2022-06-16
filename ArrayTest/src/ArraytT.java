
public class ArraytT {

	public static void main(String[] args) {
		int[] scores = {50,99,80,70,45,100};
		boolean[] jumsu;
		jumsu = new boolean[5]; //0¿∏∑Œ √ ±‚»≠ 
		System.out.println(jumsu[0]);
		
//		System.out.println(scores.length);
		
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum+= scores[i];
		}
		System.out.println("√—¡°:" + sum);
		double avg = (double)sum/scores.length;
		System.out.println("∆Ú±’:" + avg);
	}

}
