package PatternMatching;

public class switchExp {
    private int day = 4;

    public void printDay() {
        switch(day) {
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Looking forward to weekend");
        }
    }

    public static void main(String[] args) {
        switchExp switchExp = new switchExp();
        switchExp.printDay();
    }
}
