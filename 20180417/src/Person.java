
public class Person {
	
	public String name = "Aps";
	public int hp = 100;
	public int at = 5;
	
	public void doAmon(Monster mon){
		mon.hp = mon.hp - at;
		System.out.println("���͸� ��������. ���� �� : "+mon.hp);
	}

}
