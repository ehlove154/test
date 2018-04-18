
public class Ex02 {
	public static void main(String[] args) {
		A a= new A();
		a.doA();
		a.doB("유정");
		int rtnValue = a.doC();
		System.out.println("rtnValue = "+rtnValue);
		a.doD(20);
	}

}
class A{
	public void doA(){
		System.out.println("doA 함수");
	}
	public void doB(String name){ // 값에 의한 복사인지 참조에 의한 복사인지 생각
		System.out.println(name+" hello");
		return; // 함수 종료시 호출한 곳으로 돌아감
	}
	public int doC(){
		return 10; // 함수를 종료시키면서 호출 한 곳으로 10을 들고 돌아감
	}
	public int doD(int num){ // 값에 의한 복사인지 참조에 의한 복사인지 생각
		return num*num; // 함수를 종료시키면서 num의 제곱값을 가지고 호출한 곳으로 돌아감
	}
}
class B{
	
}