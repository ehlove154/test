
public class GameMain {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Monster m1 = new Monster();
		
		p1.doAmon(m1);
		m1.doAps(p1);
		while(true){
			p1.doAmon(m1);
			m1.doAps(p1);
			if(p1.hp <0){
				System.out.println("person die");
				break;
			}
			else if(m1.hp<0){
				System.out.println("monster die");
				break;
			}
		}
	}

}
