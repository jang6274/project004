package lopp.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		//for문을 사용해 1부터 100까지 더하세요
		//단 중간에, 합이 500이 넘어가면 중단합니다
		//for문이 종료되기전 num과 sum의 값을 출력하세요
		//*break를 사용할 것
				
		int sum = 0;
		int i;
		
		for (i = 1; i <=100; i++) { //1 ~ 100
			sum = sum +i;
			
			if (sum >= 500) { // sum이 500을 넘으면 for문을 종료
				System.out.println(" i : " + i + " , sum:" + sum);
				break;
			}
		}
		
		
	

		

	}

}
