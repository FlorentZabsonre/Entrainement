package testEntrainement;

public class FigureUtil {
private Rond rond;
private Rectangle rec;


public  Rond getRandomRond()
{
	Rond rond= new Rond();
	int centre=(int)Math.random();
	Point p= (new Point()).getRandomPoint();
	rond=new Rond(centre,p);
	return rond;
}

public Rectangle getRandomRectangle()
{
	
	return null;
}
}
