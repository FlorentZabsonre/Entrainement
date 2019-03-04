package testEntrainement;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public Point()
	{
		
	}
	public void initialise(int abs, int ord)
	{
		x=abs;
		y=ord;
		
	}
	public void deplace(int deltaX, int deltaY)
	{
		x += deltaX;
		y += deltaY;
	}
	
	public void deplace(int dx, byte dy)
	{
		x += dx;
		y += dy;
	}
	
	public void affiche()
	{
		System.out.println("je suis un point de coordonnée ("+x+","+y+")");
	}
	
	public String toString()
	{
		return  "["+x+";"+y+"]";
	}
	
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	
	public void setX(int newX)
	{
		this.x=newX;
	}
	 public void setY(int newY)
	 {
		 this.y=newY;
	 }
	 public static void estNull(Point p)
	 {
		 if(p instanceof Point)
		 {
			 System.out.println("ce point est null");
		 }else {
			 System.out.println("ce point n'est pas null");
		 }
	 }
	 
	 public Point copie()
	 {
		 //renvoie à une réference à un Point
		 Point tmp= new Point(x,y);
		 tmp.x=x;
		 tmp.y=y;
		 return tmp;
	 }
	 
	 boolean equals(Point p)
	 {
		 return ((p.x==x) &&(p.y==y));
	 }
}
