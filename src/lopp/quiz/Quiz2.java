package lopp.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		//숫자 11부터 20까지 합을 구하고 출력하세요
		
//		int sum = 0;
//		sum = sum + 11;
//		sum = sum + 12;
//		sum = sum + 13;
//		sum = sum + 14;
//		sum = sum + 15;
//		sum = sum + 16;
//		sum = sum + 17;
//		sum = sum + 18;
//		sum = sum + 19;
//		sum = sum + 20;
//		System.out.println("11부터20까지의 합은 " + sum + "입니다");
		
		int num = 11; // 11으로 초기화
		int sum = 0;  // 결과를 저장할 변수는 특별한 이유가 없으면 0으로 초기화
		
		while (num <= 20) {
			sum = sum + num;
			num++;
			
		}
		System.out.println("11부터20까지의 합은 " + sum + "입니다");
		
		
	}

}
