//multiple inheritance using interface in java programming.
interface IA{
void a();
}
interface IB{
void b();
}
interface IC extends IA,IB{
void c();
}


class Test implements IC{
public void a(){
System.out.println("This is IA interface a method");
}
public void b(){
System.out.println("This is IB interface b method");
}
public void c(){
System.out.println("This is IC interface c method");
}
public void hello(){
System.out.println("This is Test class hello method");
}
public static void main(String args[]){
//IA obj=new IA();
IA obj=new Test();
obj.a();
Test t=new Test();
t.hello();
t.a();
t.b();
t.c();
IB d=new Test();
d.b();
IC a=new Test();
a.c();
Test i=new Test();
i.hello();

}
}

