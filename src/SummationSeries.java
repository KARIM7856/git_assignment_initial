/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summationseries;

/**
 *
 * @author Zak
 */
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
