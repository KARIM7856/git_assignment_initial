
public class CircleArea extends ISubscriber {
	@Override
	public void notifySubscriber(String input) {
		double r = Double.parseDouble(input);
		System.out.println("Circle Area : " + (r*r)*Math.PI );
	}
}    

