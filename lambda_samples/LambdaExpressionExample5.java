package lambda_samples;

interface Addable
{
	int add(int a, int b);
}

public class LambdaExpressionExample5 {
	
	public static void main(String[] args)
	{
		
		Addable ad1 = (a,b)->(a+b);
		System.out.println("Addition : "+ad1.add(10, 20));
		
	}

}
