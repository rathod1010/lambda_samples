package lambda_samples;

interface Drawable 
{
	public void draw();
}

public class LambdaExpressionExample2 {
	
	public static void main(String[] args)
	{
		int width=10;
		
		//lambda function
		
		Drawable d2 = ()->
		{
			System.out.println("Drawing "+width);
		};
		
		d2.draw();
		
		
	}

}
