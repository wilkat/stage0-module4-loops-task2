package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int fact= 0;
        while (i<=printToInclusive) {
            fact = fact*i;
            System.out.println(fact);
        }
    }
}
