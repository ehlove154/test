import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("세로 길이 : ");
		int rows = scan.nextInt();
		
		System.out.println("가로 길이 : ");
		int cols = scan.nextInt();
		
		int a[][] = new int[rows][cols];
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "]" +a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
