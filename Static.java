//Static variable example:
class Static{
	int x;
	int y;
	static int count;
	public Static(){
	count++;
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
}

}