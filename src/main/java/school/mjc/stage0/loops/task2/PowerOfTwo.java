package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        int pow = 0;
        if(power < 0) {
            System.out.println("too much power");
        } else {
            while (i<=power) {
                pow = (int)Math.pow(2,i);
                System.out.println(pow);
                i++;
            }
        }

    }
}
