
import java.lang.Math;
public class Multiples {

    public static void main(String[] args) {
        double t = Math.floor((double) (1000-1) / 3);
        double f = Math.floor((double) (1000-1) / 5);
        double d = Math.floor((double) (1000-1) / 15);
        System.out.println((int)(t + f - d));
    }
}
