package sec02.exam;

public class ContinueTest01 {
	public static void main(String[] args) {
		for ( int i=1 ; i <= 100 ; i++ ) {
			if (i%2 != 0 ) {
				continue;
			}
			System.out.println(i+"는 짝수입니다.!");
		}
		
	}
}
