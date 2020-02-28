
public class SummationSeriesSubscriber implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		System.out.println("Hello, I am summation series subscriber and I am notified with " + input);		
		try {
			int sum = 0, num = Integer.parseInt(input);		
			 for (int i = 0; i <= num; i++) 
			    {
			            sum += i;
			    }
			    System.out.println("The Summation of series is = "+sum);
		}	
		catch (Exception e) {
			System.out.println("Invalid '"+ input +"' is not a number.");
		}		
	}
}
