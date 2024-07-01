package lopp;

public class Ex10 {

	public static void main(String[] args) {
		
		//중첩반복문을 사용하여 구구단 만들기
		//F8로 한 단씩 출력가능
		
		for (int dan = 2; dan <=9; dan++) {
			
			for (int times = 1; times <= 9; times++) {//곱하는 수 1~9
				
				System.out.println(dan + "X" + times + "=" + dan * times);
				
			}
			
			System.out.println(); //줄바꿈
		}
		
	}

}
