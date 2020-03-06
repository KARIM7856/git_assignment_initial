
public class SphereVolumeSubscriber extends ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		int r = Integer.parseInt(input);
		System.out.println("Hello i'm SphereVolumeSubsciber and "
				+ "i'm notified with " + Math.pow(r,3)*4/3.0*Math.PI);
		
	}

}
