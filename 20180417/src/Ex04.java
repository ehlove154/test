
public class Ex04 {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.doA();
		AA.doA();
		
		System.out.println("���");
		AA.bb.bbb();
	}

}
class AA{
	public static BB bb = new BB();
	
	public static void doA(){
		System.out.println("static �Լ�");
	}
}
class BB{
	public static void bbb(){System.out.println("bbb �Լ�");}
}