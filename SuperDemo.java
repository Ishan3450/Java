class demo{
    void test(){
        System.out.println("Method from Super Class");
    }
}

public class SuperDemo extends demo
{
    void test(){        
	super.test();
	System.out.println("Method from Sub Class Extending Super Class");
    }

	public static void main(String[] args) {
        SuperDemo obj1 = new SuperDemo();
        
        obj1.test();
	}
}
