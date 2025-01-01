class Point{
int x;
int y;
//Member Data
public Point(){
x=1;
y=1;
System.out.println("Default constructor is called");
}
public void showData(){
System.out.println("X_co :"+x);
System.out.println("Y_co :"+y);

}
public static void main(String args[]){
Point x=new Point();
Point y=new Point();
Point z=new Point();
x.showData();
y.showData();
z.showData();
}

}