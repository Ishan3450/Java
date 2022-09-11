public class primeNumber{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			boolean check = isPrime(i);
			System.out.println(i + " is " + check);
		}
	}
	public static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;

	}
}