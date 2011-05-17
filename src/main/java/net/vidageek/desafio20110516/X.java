package net.vidageek.desafio20110516;

final public class X {
    private static long fib(int n) {
        int x = 0, y = 1;
        while (n-- > 0) {
            int z = y;
            y = x + y;
            x = z;
        }
        return y;
    }


    public static long f(int n) {
        long z = 0;
        {
            long a = 1, b = 0;
            for (int i = 0; i < n; i++) {
                long c = b;
                b = a;
                a = b * (long) Math.pow(2, fib(i+1)) + c;
            }
            z = b;
        }
        String a = "01", b = "0";
        while (n-- > 0) {
            String c = b;
            b = a;
            a = b + c;
        }
        final long result = stringToLong(b);
        assert result == z : result + " => " + z;
        return result;
    }


    private static long stringToLong(String binaryDigits) {
        return Long.valueOf(binaryDigits, 2);
    }
}
