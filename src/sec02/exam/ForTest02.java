package sec02.exam;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 10 사이의 수 중 짝수의 합을 구하시오
		
		int sum = 0;
		
		for ( int i = 0 ; i<=10 ; i++ ) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("sum : "+sum);
	}

}
