

public class TwoPowerN extends ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int n = Integer.parseInt(input);

        long ans = 1;
        for (int i = 0 ;i < n ;i++)
            ans = ans * 2;

        System.out.println("Hello i'm a 2PowerN subscriber and " + "i'm notified with " + input);
        System.out.println("2 power " + n + " = " + ans);
    }
}
