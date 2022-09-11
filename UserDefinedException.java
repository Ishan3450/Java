public class UserDefinedException{
    public static void main(String[] args){
        int n1 = 12;
        int n2 = 2;

        if(n2 == 0){
            throw new ArithmeticException("Divide by Zero");
        } else{
            System.out.println(n1/n2);
        }
    }
}