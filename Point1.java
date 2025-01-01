//Parametrised constructor
class Point1{
int x;
int y;
//Member Data
public Point1(int a,int b){
x=a;
y=b;
System.out.println("Default constructor is called");
}
public void showData(){
System.out.println("X_co :"+x);
System.out.println("Y_co :"+y);

}
public static void main(String args[]){
Point1 x=new Point1(121,130);
Point1 y=new Point1(125,122);
Point1 z=new Point1(121,123);
x.showData();
y.showData();
z.showData();


}

}