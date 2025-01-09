//A class impliments an interface.
//interface implements by the class.
//We can not create an instance(object) of interface
//an interface does not have any constructor.
interface IA{
void a();
}
class Test implements IA{
public void a(){
System.out.println("This is IA interface method");
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
}
}
