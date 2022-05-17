class base{
int a,b;
void info(){a=10;b=23;}
}

class derived extends base{
	void add(){
	info();
	System.out.println("Sum = "+(a+b));
	}
}

class singleMain{
public static void main(String arg[]){

	derived obj = new derived();
	obj.add();
}
}
