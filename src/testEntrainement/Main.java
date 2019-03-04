package testEntrainement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

		Point a;
		a = new Point();
		a.initialise(3,5);
		a.affiche();
		//a.deplace(2, 0);
		a.affiche();

		Point b =new Point();
		b.initialise(6, 8);
		b.affiche();
		Point p= new Point();

		Point.estNull(p);
		Point c= a.copie();//c est une copie conforme de a
		
		c.affiche();
		
		Point p1= new Point();
		Object o;
		o=p;
		p1= (Point)o;
		p1.deplace(1, 2);
		
		((Point)o).deplace(0, 0);
		
		Point d= new Point(3,5);
		
		Boolean res=d.equals(b);
		System.out.println("res="+res);
	}

}
