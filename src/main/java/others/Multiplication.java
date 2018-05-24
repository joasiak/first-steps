package others;

public class Multiplication {
    public void multiplay() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 10; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t\t");
            }
            System.out.println();
        }
    }
}

