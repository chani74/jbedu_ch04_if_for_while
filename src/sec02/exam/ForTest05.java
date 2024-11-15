package sec02.exam;

public class ForTest05 {
	public static void main(String[] args) {
//		scores = [90,85,76,65,99] <- 파이썬 리스트
//		자바는 배열을 사용함
//		80점 이상이면 합격을 출력하고, 아니면 불합격 출력
//		합격 메세지 출력시 학생 번호를 추가하시오..
//		합격한 학생의 총 학생수는 출력 하시오...
		
		int[] scores = {90,85,76,65,99};
		int cnt = 0 ;
				
		for(int i=0; i<5 ; i++) {
			if (scores[i]>=80) {
				System.out.println(i+1 +"번 학생" + scores[i] + " 합격 ");
				cnt++;
			} else {
				System.out.println(i+1 +"번 학생" + scores[i] + " 불합격 ");
			}
			System.out.println( "합격자는 총 "+cnt+"입니다." );
		}
		
//	향상된 for문 
		for(int score:scores) {
			if (score>=80) {
				System.out.println(score + " 합격 ");
			} else {
				System.out.println(score + " 불합격 ");
			}
//			System.out.println(score);
		}
	}
}
