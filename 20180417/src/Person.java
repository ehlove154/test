
public class Person {
	
	public String name = "Aps";
	public int hp = 100;
	public int at = 5;
	
	public void doAmon(Monster mon){
		mon.hp = mon.hp - at;
		System.out.println("몬스터를 공격했음. 몬스터 피 : "+mon.hp);
	}

}
