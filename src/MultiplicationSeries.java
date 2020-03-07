
public class MultiplicationSeries extends ISubscriber {



	@Override

	public void notifySubscriber(String input) {
		int x;
		int multiply=1;

		 x = Integer.parseInt(input);
		for(int i = 1 ; i < x+1 ; i++){
		multiply = multiply*i;
		}

		System.out.println("Hello i'm a Multiplication Series subscriber and " + "i'm notified with " + input);
		 System.out.println("The multiplication of The Series of "+ x +" is: "+ multiply );

		

	}



}
