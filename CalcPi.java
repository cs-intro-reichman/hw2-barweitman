// Computes an approximation of PI.
public class CalcPi {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        double addnum = 0;
        double total = 1;

        for (int i = 1; i < number; i++) {
            addnum = (double) 1 / (2 * i + 1);
            if (i % 2 == 0)
                total = total + addnum;
            else
                total = total - addnum;
        }
        double appr = total * 4;

        System.out.println("pi according to Java: " + Math.PI); 
        System.out.println("pi, approximated: " + appr); 
    }
}
