class MyThread extends Thread{
    MyThread(String s){
        super(s);
        start();
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                if(Thread.currentThread().getName() == "Thread1")
                	Thread.sleep(2000);
                else
	                Thread.sleep(4000);
            }
            catch (Exception e){
                System.out.println("Exception Thrown !!");
            }
        }
    }
}
public class MultiThreadDemo{
    public static void main(String[] args){
        System.out.println("Thread Name :" + Thread.currentThread().getName());
        MyThread m1 = new MyThread("Thread1");
        MyThread m2 = new MyThread("Thread2");
    }
}