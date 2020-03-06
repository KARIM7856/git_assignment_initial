/**
 *  @file    SphereVolume.java
 *  @author  Mahmoud Ahmed Tawfik(@mahmoudahmedd) - 20160227
 *  @date    02/03/2020
 */



public class SphereVolume extends ISubscriber
{    
    @Override
    public void notifySubscriber(String input) 
    {
        double r = Double.parseDouble(input);
        double volume = ((4.0/3.0) * r * r * r) / Math.PI;
        
        System.out.println("Hello, I am really a sphere volume and I am notified with " + volume);
    }
}
