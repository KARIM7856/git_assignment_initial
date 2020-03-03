import java.util.Scanner;

public class Main 
{
    private static ISubscriber subscribers [] = {
        new SphereVolume("5.0")
        new SimpleSubscriber("1.0") ,
        new MultiplicationSeries("2.0"),
        new SphereVolumeSubscriber("4.0"),
        new SummationSeries("3.0"),
        new CircleArea("5.0"),
        new Circlecir("4.0"),
        new TwoPowerN("5.0")
    };
    
    public static void main(String[] args) 
    {
        Topic mathTopic = new Topic();
        for (ISubscriber sub : subscribers) 
        {
            mathTopic.addSubscriber(sub);
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        mathTopic.dispatchEvent(input);
    }
}