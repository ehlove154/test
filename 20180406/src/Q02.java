/*
 * 2. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램
 * int [][] arr = {
 * {5,5,5,5,5}, {10,10,10,10,10}, {20,20,20,20,20}, {30,30,30,30,30} };
 */
public class Q02 {
	public static void main(String[] args) {
		int [][] arr = { {5,5,5,5,5}, {10,10,10,10,10}, {20,20,20,20,20}, {30,30,30,30,30}};
		int total = 0;
		double avg = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				total = total + arr[i][j];
			}
		}
		
		avg = (double)total / (arr.length*arr[0].length);
		
		System.out.println("총합 = "+total);
		System.out.println("평균 = "+avg);
	}

}
