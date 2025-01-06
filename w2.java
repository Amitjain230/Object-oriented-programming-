//har ek class ki base class object hoti haa.
//equal method is a method of object.
//different object have different content.
//false because refrence different.In string
//Overriding::

class w2{
	public static void main(String args[]){
	StringBuffer sb1=new StringBuffer("hi");
	StringBuffer sb2=new StringBuffer("hi");
	System.out.println(sb1.equals(sb2));//false
	String sb3=new String("hi");
	String sb4=new String("hi");
	System.out.println(sb3.equals(sb4));//true
	Object sb5=new String("hi");
	Object sb6=new String("hi");
	System.out.println(sb5.equals(sb6));
	

}


}