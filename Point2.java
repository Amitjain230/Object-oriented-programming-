//Getter setter
class Point2{
private int x;
private int y;
//Member Data
public int getX(){
return x;
}
public void setX(int x){
this.x=x;
}
public int getY(){
return y;
}
public void setX(int x){
this.y=y;
}

public Point2(int a,int b){
x=a;
y=b;
System.out.println("Default constructor is called");
}
public void showData(){
System.out.println("X_co :"+x);
System.out.println("Y_co :"+y);

}
Point2 p2=new Point2();
p2.setX(11);
p2.setY(22);
System.out.println("X_co :"+p2.getX());
System.out.println("Y_co :"+p2.getY());




}

}