package sec01.exam06;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = (int) (Math.random() * 12 ) + 1 ;
		
		switch(month) {
		case 2 :
			System.out.println(month + "월은 28일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일입니다.");
			break;
		default :
			System.out.println(month + "월은 31일입니다.");
		}
	}

}
