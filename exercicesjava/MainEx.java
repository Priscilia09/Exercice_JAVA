public class MainEx{

	public static void main(String args[]){
		
		Rectangle rect1 = new Rectangle(5,2);
		Carre rect2 = new Carre(7);
		

		System.out.println(rect1.getLongueur());
		System.out.println(rect2.getLongueur());

		System.out.println(rect1.surface());
		System.out.println(rect1.perimetre());
		System.out.println(rect2.surface());
		System.out.println(rect1.diagonale());
		System.out.println(rect2.diagonale());

	}

}