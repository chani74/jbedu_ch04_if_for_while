package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("읿반 회원입니다.");
			break;
		default :
			System.out.println("손님 입니다.");
		}
	}

}
