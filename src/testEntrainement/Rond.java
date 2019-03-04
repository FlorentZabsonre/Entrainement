package testEntrainement;

public class Rond {
 private int r;
 private Point p;
  
 public Rond() {}
 public Rond(int r, Point p)
 {
	 this.r=r;
	 p=this.p;
 }
 public int getR()
 {
	 return this.r;
 }
 
 public Point getP()
 {
	 return this.p;
	 
 }
 public void setR(int newR)
 {
	 this.r= newR;
 }
 public void setP(Point newP)
 {
	 this.p=newP;
 }
 
 public String toString()
 {
	 return "[ROND ["+this.p.getX()+";"+this.p.getY()+"],"+r+"]";
 }
  public void affiche()
  {
	  String res= this.toString();
	 System.out.println(res);
  }
}