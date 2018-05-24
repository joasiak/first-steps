package others;

public class ConverterGivenBase {
    private static final int max_base = 16;
    private static final String pattern = "0123456789ABCDEF";

    public String convert(int number, int base) {

        String result = "";

        if ((base > max_base) || (base < 2))
            return null;

        if (number==0)
            return "0";

        while (number>0) {
            result = pattern.charAt(number % base) + result;
            number /= base;
        }

        return result;
    }
}

