public class Circlecir implements ISubscriber {

    public void Circle(String input) {

        double r= new Double(input);
        double circum = 2*3.14*r;
        System.out.println("\nCircumference of Circle = " +circum);
    }

    @Override
    public void notifySubscriber(String input) {
        Circle(input);
    }
}
