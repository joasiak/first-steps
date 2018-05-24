package others;

public class ConverterBinaryBase {
    private int number;

    public ConverterBinaryBase(int number) {
        this.number=number;
    }

    public String convertToBin() {

        String result = "";

        if (number == 0)
            return "0";

        while (number>0) {
            int modulo = number % 2;
            result = String.valueOf(modulo) + result;
            number=number/2;   // number/=2
        }
        return result;
    }

    public int getNumber() {
        return this.number;
    }
}
