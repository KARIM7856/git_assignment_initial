public class SummationSeries implements ISubscriber {

    @Override
    public void notifySubscriber(String input) 
    {
        int num , summation ;
        num = Integer.parseInt(input);
        summation = (num*(num+1))/2 ; 
	System.out.println("Hello, I am a summayion series subscriber and I am notified with " + input);
        System.out.println("The Summation of The Series is: " + summation );
    }
    
}
