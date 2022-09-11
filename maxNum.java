public class maxNum{
	public static void main(String[] args){
		int a=10,b=20,c=20;

		if(a > b){
			if(a > c){
				System.out.println("A : " + a);
			}
			else{
				System.out.println("C : " + c);
			}
		}
		else if(a == b && a < c){
			System.out.println("A and B are same and Maximum")
		}
		else if(a == c && a < c){

		}
		else{
			if(b > c){
				System.out.println("B :" + b);
			}
			else{
				System.out.println("C :" + c);
			}
		}
	}
}