class Point{
public int x;
public int y;//instance variable
public int z=101;
public Point(){
System.out.println("Point class Default Constructor is called");
}

public Point(int x,int y){
this.x=x;
this.y=y;
System.out.println("Point class Parameterized Constructor is called");
}

void showData(){
System.out.println("X_CO : "+x);
System.out.println("Y_CO : "+y);

}
void hi(){
System.out.println("Hi... Method is Called");

int x=111;
int y=222;
System.out.printf("\nx=%d  Y=%d ",this.x,this.y);


}


}
class Circle extends Point{
float r;
int z=102;
public Circle(){
System.out.println("Circle class Default Constructor");
}
public Circle(int x,int y,float r){
super(x,y);//call  parent class constructor
this.r=r;
System.out.println("Circle class Parameterized Constructor");
}
void showData(){
super.hi();
System.out.println("X_CO : "+x);
System.out.println("Y_CO : "+y);
System.out.println("Radius is : "+r);
System.out.println("circle z= : "+z);
System.out.println("Point class z= : "+super.z);
}

public static void main(String args[]){
//Circle c1=new Circle();
//Point class default constructor (1)and Circle class default constructor(2)
Circle c2=new Circle(11,22,5.6f);
c2.showData();
}


}
//constructor is overrided not overloded.
//constructor have no written type.
//constructor and class name should be same.
//Parent class constructor calls first.
//In inheritance if default constructor in both child and parent class it calls parent default constructor then child class default.
//In parent automatically default constructor is called.
//if we access other class property we can use super keyword.