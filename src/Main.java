import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
		        new SphereVolumeSubscriber(),
			new MultiplicationSeries(),
			new Circlecir(),
		        new SummationSeries(),
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
			//System.out.println("fdf");
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
