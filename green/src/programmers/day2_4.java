package programmers;
//Q. 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
public class day2_4 {
	public static void main(String[] args) {
		int[] a = {1,2};
		System.out.println(solution(a));
	}

	public static int[] solution(int[] numbers) {
		int[] answer =new int[numbers.length];
		if (numbers != null) {
			for (int i = 0; i < numbers.length; i++) {
				answer[i] = numbers[i] * 2;
			}
		}
		return answer;
	}
}
