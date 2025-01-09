//multiple interface method.
interface IA{
void a();
}
interface IB{
void b();
}

class Test implements IA,IB{
public void a(){
System.out.println("This is IA interface a method");
}
public void b(){
System.out.println("This is IA interface b method");
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
IB c=new Test();
c.b();
Test i=new Test();
i.hello();

}
}
