class Parent{
	 final int MAX=10;
public void show(){
	System.out.println("This is parent class");

}
}
	class Child extends Parent{
	public void show(){
        final int MAX=55;
	System.out.println("This is child class"+MAX);
	System.out.println("This is child class"+super.MAX);

	
}
	public static void main(String args[]){
	Parent c=new Child();
	c.show();
}
}
//super for access first final that we can access.
