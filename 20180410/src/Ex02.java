import java.util.Calendar;
import java.util.Scanner;


public class Ex02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�⵵ �Է� : ");
		int year = scan.nextInt();
		System.out.println("�� �Է� : ");
		int mon =  scan.nextInt();
		
		System.out.println(year + "��" + mon + "��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		cal.set(year, mon-1, 1);
		
		int end_date = cal.getActualMaximum(Calendar.DATE);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		for(int i = 1; i<week; i++){
			System.out.print("\t");
		}
		
		for(int i = 1; i<=end_date; i++){
			System.out.print(i+"\t");
			if(week%7==0){
				System.out.println();
			}
			week++;
		}
	}

}
