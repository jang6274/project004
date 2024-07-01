package lopp.quiz;

public class Quiz7 {

	public static void main(String[] args) {
		
		//구구단을 3단부터 7단까지만 출력하세요
		for (int dan = 3; dan <=7; dan++) {
			
			for (int times = 1; times <= 9; times++) {//곱하는 수 1~9
				
				System.out.println(dan + "X" + times + "=" + dan * times);
				
			}
			
			System.out.println(); //줄바꿈
		}
		
		
		
		
		

	}

}
