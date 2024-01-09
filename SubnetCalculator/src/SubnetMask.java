public class SubnetMask {
    private String mask;
    private int cidr;

    public SubnetMask(String mask) {
        this.mask = mask;
    }

    public SubnetMask(int cidr) {
        this.cidr = cidr;
    }

    public String getBinaryMask() {
        String[] maskBinaryOctets = new String[4];
        // Split the mask
        String[] octets = this.mask.split("\\.");
        // Convert each octet to binary
        maskBinaryOctets[0] = NumberConverter.fromDecimalToBinary(octets[0]);
        maskBinaryOctets[1] = NumberConverter.fromDecimalToBinary(octets[1]);
        maskBinaryOctets[2] = NumberConverter.fromDecimalToBinary(octets[2]);
        maskBinaryOctets[3] = NumberConverter.fromDecimalToBinary(octets[3]);
        // Concatenate the binary octets
        return maskBinaryOctets[0] + "." + maskBinaryOctets[1] + "." + maskBinaryOctets[2] + "." + maskBinaryOctets[3];
    }

    public String getMask(int cidr) {
        String temp = "";
        // Convert the cidr to Mask
        for (int i = 0; i < cidr; i++) {
            temp += "1";
        }
        for (int i = cidr; i < 32; i++) {
            temp += "0";
        }
        // Split the mask
        String[] octets = new String[4];
        octets[0] = temp.substring(0, 8);
        octets[1] = temp.substring(8, 16);
        octets[2] = temp.substring(16, 24);
        octets[3] = temp.substring(24, 32);
        // Convert each octet to decimal
        String mask = NumberConverter.fromBinaryToDecimal(octets[0]) + "." + NumberConverter.fromBinaryToDecimal(octets[1]) + "." + NumberConverter.fromBinaryToDecimal(octets[2]) + "." + NumberConverter.fromBinaryToDecimal(octets[3]);
        this.mask = mask;
        return mask;
    }

    public int getCidr(String maskBinary) {
        cidr = 0;
        // Count the number of 1s
        for (int i = 0; i < maskBinary.length(); i++) {
            if (maskBinary.charAt(i) == '1') {
                cidr++;
            }
        }
        cidr = this.cidr;
        return cidr;
    }
    @Override
    public String toString() {
        return "Subnet Mask: " + this.mask;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public int getCidr() {
        return cidr;
    }

    public void setCidr(int cidr) {
        this.cidr = cidr;
    }
}
