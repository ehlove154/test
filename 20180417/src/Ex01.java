
public class Ex01 {
	public static void main(String[] args) {
		HomeWork youjungA = new HomeWork();
		youjungA.doWork();
		HomeWork youjungB = new HomeWork();
		youjungB.doWork();
		
		System.out.println("youjungA 개인과제 한 횟수"+youjungA.private_subject_cnt);
		System.out.println("youjungA 공통과제 한 횟수"+HomeWork.common_subject_cnt);
		
		System.out.println("youjungB 개인과제 한 횟수"+youjungB.private_subject_cnt);
		System.out.println("youjungB 공통과제 한 횟수"+HomeWork.common_subject_cnt);
	}

}

class HomeWork{
	public int private_subject_cnt = 0;
	public static int common_subject_cnt = 0; // 메모리 낭비와 효율
	public void doWork(){
		private_subject_cnt++;
		common_subject_cnt++;
		
	}
}