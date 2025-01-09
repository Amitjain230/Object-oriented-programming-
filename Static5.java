//multiple argument same type. beasause it store array value.
//variable argument is the last formal argument.
//if we take normal argument then 
class Static{
	public static void add(int...x){
	int sum=0;
	for(int a:x){
	sum=sum+a;
}
System.out.println("sum is:"+sum);

}


	public static void main(String...args){
	add();
	add(10,20*10);
	add(10,20,50);
	add(10,20,50,60,50,80);


}
}
