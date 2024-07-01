package lopp.quiz;

public class Quiz10 {

	public static void main(String[] args) {

		// 반복문을 사용하여 작성(1)
		for (int i = 1; i <= 5; i++) { //삼각형의 높이

			// 삼각형의 길이
			System.out.print("??"); // *삼각형 높이
		}

		// 반복문을 사용하여 작성(2)
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) { // 삼각형 길이
				System.out.print("*");
			}

			System.out.println();
		}

	}
}

//<문제풀이>
//도형의 패턴을 찾아서 반복문과 조건문으로 표현
//첫번째 줄: 별1개
//두번째 줄: 별2개
//높이에따라 별문자를 출력함