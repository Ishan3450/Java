class MyThread extends Thread{
    String s;
    MyThread(String s1){
        s = s1;
        start();
    }
    public void run(){
        System.out.println(s);
    }
}

public class ThreadDemo{
    public static void main(String[] args){
        MyThread t = new MyThread("Thread Started....");
    }
}
