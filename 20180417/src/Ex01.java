
public class Ex01 {
	public static void main(String[] args) {
		HomeWork youjungA = new HomeWork();
		youjungA.doWork();
		HomeWork youjungB = new HomeWork();
		youjungB.doWork();
		
		System.out.println("youjungA ���ΰ��� �� Ƚ��"+youjungA.private_subject_cnt);
		System.out.println("youjungA ������� �� Ƚ��"+HomeWork.common_subject_cnt);
		
		System.out.println("youjungB ���ΰ��� �� Ƚ��"+youjungB.private_subject_cnt);
		System.out.println("youjungB ������� �� Ƚ��"+HomeWork.common_subject_cnt);
	}

}

class HomeWork{
	public int private_subject_cnt = 0;
	public static int common_subject_cnt = 0; // �޸� ����� ȿ��
	public void doWork(){
		private_subject_cnt++;
		common_subject_cnt++;
		
	}
}