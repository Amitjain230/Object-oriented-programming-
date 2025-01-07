//Static method example:
class Static{
	int x;
	int y;
	static int count;
	static{
	int count=100;
	System.out.println("This is Static block 1");
}
	public Static(){
	count++;
}
	public static int getctr(){
	return count;
}
static{
	int count=300;
	System.out.println("This is Static block 3");
}

	public static void main(String args[]){
	Static p1=new Static();
	Static p2=new Static();
	Static p3=new Static();
	Static p4=new Static();
	Static p5=new Static();
	System.out.println(p1.count);
	System.out.println("Number of object is created :"+count);
	System.out.println("Number of object is created :"+Static.count);
	System.out.println("=====Static=======>"+p1.getctr());
	System.out.println("Number of object is created :"+Static.count);
	System.out.println("Number of object is created :"+p1.getctr());
	System.out.println("Number of object is created :"+getctr());
}
static{
	int count=200;
	System.out.println("This is Static block 2");
}

}