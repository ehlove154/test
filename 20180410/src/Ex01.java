import java.util.Calendar;


public class Ex01 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int end_date = cal.getActualMaximum(Calendar.DATE);
		System.out.println("�̹� �� ��¥�� : "+end_date);
		System.out.println();
		
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		System.out.println("�⵵ : " + year);
		System.out.println("�� : "+mon);
		System.out.println("�� : "+date);
		System.out.println();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println("�ð� : "+hour);
		System.out.println("�� : "+min);
		System.out.println("�� : "+sec);
		System.out.println();
		
		cal.set(2016, 2, 10);

		int start_week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("�̹� �� ���ۿ��� : "+start_week);
		System.out.println();
		
		year = cal.get(Calendar.YEAR);
		mon = cal.get(Calendar.MONTH);
		date = cal.get(Calendar.DATE);
		System.out.println("�⵵ : " + year);
		System.out.println("�� : "+mon);
		System.out.println("�� : "+date);
		
	}

}
