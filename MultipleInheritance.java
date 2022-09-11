interface animal1{
    public void eat();
}
interface animal2{
    public void walk();
}

class Summary implements animal1,animal2{
    public void eat(){
        System.out.println("This is animal 1 Interface");
    }
    public void walk(){
        System.out.println("This is animal 2 Interface");
    }
}

public class MultipleInheritance{
        public static void main(String[] args){
            Summary s = new Summary();
            s.eat();
            s.walk();
    }
}