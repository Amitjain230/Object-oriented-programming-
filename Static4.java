class Static{
	public static void add(){
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Addition is:"+c);

}
public static void add(int a,int b){
	int c=a+b;
	System.out.println("Addition is:"+c);

}
	public static void add(int a,int b,int c){
	int d=a+b+c;
	System.out.println("Addition is:"+d);

}
	public static void main(String args[]){
	add();
	add(10,20);
	add(10,20,50);


}

}