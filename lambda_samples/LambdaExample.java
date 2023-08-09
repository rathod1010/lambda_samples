package lambda_samples;

interface MathOperation
{
	int operate(int x, int y);
}

public class LambdaExample {
	
	public static void main(String[] args)
	{
		
		//using a regular anonymous class
		MathOperation addition = new MathOperation() {
			
			@Override
			public int operate(int x, int y) {
			
				return x+y;
			}
		};
		
		//using a lambda expression 
		MathOperation add = (x,y)->x+y;
		System.out.println(addition.operate(10, 20));
		System.out.println(add.operate(20, 30));
		
	}
	

}
