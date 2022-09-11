public class CommandLineArguementDemo{
	public static void main(String[] args){
		int sum = 0;
		int avg = 0;

		if(args.length == 0){
			System.out.println("Please Enter Some Arguements First !!");
		}else{
			for(int i=0;i<args.length;i++){
				sum += Integer.parseInt(args[i]);
			}
			avg = sum / args.length;
			System.out.println("Sum : " + sum);
			System.out.println("Average : " + avg);
		}
	}
}