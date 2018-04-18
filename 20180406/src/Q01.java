/*
 * 1. 배열 arr에 담긴 모든 값을 더하는 프로그램
 * int arr = {10,20,30,44,55};
 */
public class Q01 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,44,55};
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			temp = temp + arr[i];
		}
		System.out.println("total = " +temp);
	}

}
