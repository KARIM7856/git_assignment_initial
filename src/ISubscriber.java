package javaapplication1;

public abstract class ISubscriber extends Thread
{
    protected String input;
    
    public abstract void notifySubscriber(String input);
    
    @Override
    public void run()
    {
        notifySubscriber(this.input);
    }
}
