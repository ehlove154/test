
public class Ex02 {
	public static void main(String[] args) {
		A a= new A();
		a.doA();
		a.doB("����");
		int rtnValue = a.doC();
		System.out.println("rtnValue = "+rtnValue);
		a.doD(20);
	}

}
class A{
	public void doA(){
		System.out.println("doA �Լ�");
	}
	public void doB(String name){ // ���� ���� �������� ������ ���� �������� ����
		System.out.println(name+" hello");
		return; // �Լ� ����� ȣ���� ������ ���ư�
	}
	public int doC(){
		return 10; // �Լ��� �����Ű�鼭 ȣ�� �� ������ 10�� ��� ���ư�
	}
	public int doD(int num){ // ���� ���� �������� ������ ���� �������� ����
		return num*num; // �Լ��� �����Ű�鼭 num�� �������� ������ ȣ���� ������ ���ư�
	}
}
class B{
	
}