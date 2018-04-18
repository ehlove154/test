/*
 *  ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 *  
 *  �޼��� �� : isNumber
 *  ��� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�.
 *  ��� ���ڷθ� �̷���������� true�� ��ȯ�ϰ�,
 *  �׷��� ������ false�� ��ȯ�Ѵ�.
 *  ���� �־��� ���ڿ��� null�̰ų� ���ڿ�""�̶�� false�� ��ȯ�Ѵ�.
 *  ��ȯŸ�� : boolean
 *  �Ű����� : String str - �˻� �� ���ڿ�
 *  
 *  [HINT]
 *  String Ŭ������ charAt(int i)
 *  �ż��带 ����ϸ� ���ڿ��� i���� ��ġ�� ���ڸ� ���� �� �ִ�.
 *  
 *  isNan �̹� ����
 */
public class Ex05 {
	public static void main(String[] args) {
		String str1 = "1234";
		System.out.println("str1�� �����Դϱ�?" + isNumber(str1));
		
		String str2 = "12345��";
		System.out.println("str2�� �����Դϱ�?" + isNumber(str2));
		
		String str3 = "";
		System.out.println("str3�� �����Դϱ�?" + isNumber(str3));
	}
	public static boolean isNumber(String str){
		if(str == null || str.equals("")){
			return false;
		}
		for(int i = 0; i<str.length(); i++){
		
			char ch = str.charAt(i);
			
			if(ch < '0' || ch>'9'){
				return false;
			}
		}
		return true;
	}
}
