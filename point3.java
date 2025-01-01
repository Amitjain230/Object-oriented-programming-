import java.util.Scanner;
class point{
	static int x;
	static int y;
	point(){
	System.out.println(" Point Happy Birthday");
	}
	point(int x,int y){
	this.x=x;
	this.y=y;
	System.out.println(" Point Parametrized constructor");
	}
	public static void main(String args[]){
	point p=new point();
	point p2=new point(1,2);
}
}
class circle extends point{
	public float r;
	 public circle(){
	System.out.println(" Circle Happy Birthday");
	}
	public circle(float r){
	this.r=r;
	System.out.println(" circle Parametrized constructor");
	}
	public static void main(String args[]){
	circle p=new circle();
	circle p2=new circle(1);
}
}