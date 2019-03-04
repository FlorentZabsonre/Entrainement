package testEntrainement;

public class Rectangle {
	private Point basGauche;
	private Point basDroit;
	private Point hautGauche;
	private Point hautDroit;
	private int hauteur;
	private int largeur;
	public Rectangle() {}

	public Rectangle(Point p, int hauteur, int largeur)
	{
		this.basGauche= new Point(p.getX(),p.getY());
		this.hautGauche=new Point(p.getX(),p.getY()+hauteur);
		this.basDroit=new Point(p.getX()+largeur,p.getY());
		this.hautDroit=new Point(p.getX()+largeur,p.getY()+hauteur);
	}

	public Point getBasGauche() {
		return basGauche;
	}

	public void setBasGauche(Point basGauche) {
		this.basGauche = basGauche;
	}

	public Point getBasDroit() {
		return basDroit;
	}

	public void setBasDroit(Point basDroit) {
		this.basDroit = basDroit;
	}

	public Point getHautGauche() {
		return hautGauche;
	}

	public void setHautGauche(Point hautGauche) {
		this.hautGauche = hautGauche;
	}

	public Point getHautDroit() {
		return hautDroit;
	}

	public void setHautDroit(Point hautDroit) {
		this.hautDroit = hautDroit;
	}

	public String toString()
	{
		return "[RECT["+this.basGauche.getX()+";"+this.basGauche.getY()+"]"
				+ "["+this.hautGauche.getX()+";"+this.hautGauche.getY()+"]"
				+ "["+this.basDroit.getX()+";"+this.basDroit.getY()+"]"
						+ "["+this.hautDroit.getX()+";"+this.hautDroit.getY()+"]";
				
	}
	public void affiche()
	{
		String res= this.toString();
		System.out.println(res);
	}
	
}
