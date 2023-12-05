public class Main {
    public static void main(String[] args) {
        Binary b1 = new Binary(192);
        b1.convertToBinary();
        System.out.println(b1.getBinary());
        b1.convertToDecimal();
        System.out.println(b1.getDecimal());
    }
}