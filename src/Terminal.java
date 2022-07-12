public class Terminal {

    public static void sayHello() {
        System.out.println("Hello, user! The temperature converter greets you.");
    }

    public static void printAnswer(String scaleFrom, String scaleTo, double tempFrom, double tempTo) {
        System.out.println(tempFrom + scaleFrom + " = " + tempTo + scaleTo);
    }
}
