public class NumberConverter {
    public static String fromDecimalToBinary(String decimal) {
        int decimalInt = Integer.parseInt(decimal);
        String binary = Integer.toBinaryString(decimalInt);
        // Add leading zeros
        while (binary.length() < 8) {
            binary = "0" + binary;
        }
        return binary;
    }

    public static String fromBinaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        String decimalString = Integer.toString(decimal);
        return decimalString;
    }
}
