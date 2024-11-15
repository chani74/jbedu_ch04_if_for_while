package sec02.exam;

public class BreakTest01 {
	public static void main(String[] args) {
		int a = 0;
		
		while (a>=0) {
			a++;
			System.out.println(a+"번님 입장하셨습니다.");
			if ( a== 1000) {
				System.out.println(a + " 번째 까지 입장 가능 ");
				break;
			}
		}
		
		
	}
}
