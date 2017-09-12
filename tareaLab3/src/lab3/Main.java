package lab3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster m1, m2, m3;
		m1 = new FireMonster();
		m2 = new WaterMonster();
		m3 = new StoneMonster();
		
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
	}

}
