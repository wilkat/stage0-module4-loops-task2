package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        while (i != multiplyByAndToInclusive) {
            if(multiplyByAndToInclusive < 0){
                System.out.println(i*multiplyByAndToInclusive);
                i--;
            } else {
                System.out.println(i*multiplyByAndToInclusive);
                i++;
            }
        }
    }
}
