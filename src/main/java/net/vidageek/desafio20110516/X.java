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
        String a = "01", b = "0";
        if (n-- > 0) {
            String c = "0";
            assert 0 == stringToLong(c);
            b = "01";
            assert 1 == stringToLong(b);
            a = "01" + "0";
            assert 1 * 2 + 0 == stringToLong(a);
            assert Math.pow(2, fib(1)) == 2;
        }
        if (n-- > 0) {
            String c = "01";
            assert 1 == stringToLong(c);
            b = "010";
            assert 2 == stringToLong(b);
            a = "010" + "01";
            assert 2 * 4 + 1 == stringToLong(a);
            assert Math.pow(2, fib(2)) == 4;
        }
        if (n-- > 0) {
            String c = "010";
            assert 2 == stringToLong(c);
            b = "01001";
            assert 8 + 1 == stringToLong(b);
            a = "01001" + "010";
            assert (8 + 1) * 8 + 2 == stringToLong(a);
            assert Math.pow(2, fib(3)) == 8;
        }
        if (n-- > 0) {
            String c = "01001";
            assert 8 + 1 == stringToLong(c);
            b = "01001010";
            assert 64 + 8 + 2 == stringToLong(b);
            a = "01001010" + "01001";
            assert (64 + 8 + 2) * 32 + (8 + 1) == stringToLong(a);
            assert Math.pow(2, fib(4)) == 32;
        }
        if (n-- > 0) {
            String c = "01001010";
            assert 64 + 8 + 2 == stringToLong(c);
            b = "0100101001001";
            assert 2048 + 256 + 64 + 8 + 1 == stringToLong(b);
            a = "0100101001001" + "01001010";
            assert (2048 + 256 + 64 + 8 + 1) * 256 + (64 + 8 + 2) == stringToLong(a);
            assert Math.pow(2, fib(5)) == 256;
        }
        while (n-- > 0) {
            String c = b;
            b = a;
            a = b + c;
        }
        return stringToLong(b);
    }


    private static long stringToLong(String binaryDigits) {
        return Long.valueOf(binaryDigits, 2);
    }
}
