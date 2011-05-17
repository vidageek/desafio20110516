package net.vidageek.desafio20110516;

final public class X {
    public static long f(int n) {
        String a = "01", b = "0";
        if (n-- > 0) {
            String c = "0";
            assert 0 == stringToLong(c);
            b = "01";
            assert 1 == stringToLong(b);
            a = "01" + "0";
            assert 1 * 2 + 0 == stringToLong(a);
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
