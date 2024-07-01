package lopp;

public class Ex8 {

	public static void main(String[] args) {
		
		//continue 사용하여 1~10 사이의 홀수들의 합 구하기
		
		int sum = 0; // 합계
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) { //짝수는 스킵
				continue;
				//특정 조건에서 건너뛰어야 할때 사용할 것
			}
			sum = sum + i; //홀수면 sum에 더하기
			
		}	
		
		System.out.println("1부터 10까지의 홀수들의 합은 " + sum);
		
		
		
		
		
	}

}
