//abstract class have constructor.
//we can not create object of abstract class.
//child class have their own method.
//Parent class does not have their own method.
//call only those method which found in abstract class.
abstract class Rgpv{
public Rgpv(){
	System.out.println("This is rgpv class constructor ");
}
public abstract void lab();
public abstract void cctv();
public void copycheck(){
System.out.println("This is a copy check method of rgpv class class and this is not abstract method ");
} 
}
class collage extends Rgpv{
public collage(){
	System.out.println("This is rgpv class constructor ");
}
	public void cctv(){
	System.out.println("CCtv method");
}
public void lab(){
	System.out.println("CCtv method");
}
public void staff(){
	System.out.println("staff method");
}
public static void main(String args[]){
Rgpv t1=new collage();
t1.lab();
t1.copycheck();
collage t=new collage();
t.staff();
}
}
