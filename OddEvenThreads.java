public class OddEvenThreads{
	public static void main(String[] args){
		OddEven o1 = new OddEven("Odd Number Thread" , 1);
		OddEven o2 = new OddEven("Even Number Thread" , 2);
		o1.start();
		o2.start();
	}
}	
class OddEven extends Thread{
	private int number;
	public OddEven(String name,int p_number){
		super(name);
		this.number = p_number;
	}
	public void run(){
		for(int i=0;i<25;i++){
			System.out.println(getName() + this.number);
			this.number += 2;
		}
	}
}