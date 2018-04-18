
public class Monster {
	
	public String name = "Amon";
	public int hp = 150;
	public int at = 4;
	
	public void doAps(Person per){
		per.hp = per.hp - at;
		System.out.println("사람을 공격했음. 사람 피 : "+per.hp);
	}

}
