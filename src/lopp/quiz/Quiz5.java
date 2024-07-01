package lopp.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		//1부터 100까지의 수 중에서 3의 배수만 출력하세요
		
		// contineue 사용
		for (int i = 1; i <=100; i++) {
			if (i % 3 != 0) { //i가 3의 배수가 아니면 다음 코드를 스킵
				continue;
			}
			System.out.println(i);
	
		}
		
		// continue를 안 썼을 때
		for (int i = 1; i <= 100; i++) {
			if (i % 3== 0) {
				System.out.println(i);
				
			}
		}
		
	}

}
