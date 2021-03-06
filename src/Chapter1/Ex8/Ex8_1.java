package Chapter1.Ex8;

/**
 * Created by julian on 13.12.14.
 */
public class Ex8_1 {
    public static void main(String[] args) {
        long n = Long.MAX_VALUE;
        System.out.println("n = "+n);
        System.out.println("BIN: "+Long.toBinaryString(n));
        System.out.println("HEX: "+Long.toHexString(n));
        long m = n+1;
        System.out.println("m = "+m);
        System.out.println("BIN: "+Long.toBinaryString(m));
        System.out.println("HEX: "+Long.toHexString(m));
        Long max = new Long(n);
        System.out.println("Zamiana na typ int, m = "+max.intValue());
        System.out.println("BIN: "+
                Integer.toBinaryString(max.intValue()));
        System.out.println("HEX: "+Integer.toHexString(max.intValue()));
        System.out.println("Zamiana na typ int, m = "+(int)m);
        System.out.println("BIN: "+Integer.toBinaryString((int)m));
        System.out.println("HEX: "+Integer.toHexString((int)m));
    }
}
