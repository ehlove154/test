import java.util.Calendar;


public class Ex01 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int end_date = cal.getActualMaximum(Calendar.DATE);
		System.out.println("이번 달 날짜끝 : "+end_date);
		System.out.println();
		
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		System.out.println("년도 : " + year);
		System.out.println("월 : "+mon);
		System.out.println("일 : "+date);
		System.out.println();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println("시간 : "+hour);
		System.out.println("분 : "+min);
		System.out.println("초 : "+sec);
		System.out.println();
		
		cal.set(2016, 2, 10);

		int start_week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("이번 달 시작요일 : "+start_week);
		System.out.println();
		
		year = cal.get(Calendar.YEAR);
		mon = cal.get(Calendar.MONTH);
		date = cal.get(Calendar.DATE);
		System.out.println("년도 : " + year);
		System.out.println("월 : "+mon);
		System.out.println("일 : "+date);
		
	}

}
