class base{
	int a,b;
	void info(){
		a=10;b=23;
	}
}

class subderived extends base{

	void add(){
		info();
		System.out.println("Sum = "+(a+b));
	}
}

class derived extends subderived{
	void mul(){
		add();
		System.out.println("multiply = "+(a*b));
	}
}

class multilevelMain{
public static void main(String arg[]){

	derived obj = new derived();
	obj.mul();
}
}
