class Program 
{
	String name;
	int age;
	
	Program(String name,int age){
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) 
	{
		Program obj = new Program("Bharani",22);
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
}
