public class Subnetter {
    private String ip, subnetMask, ipBinaryWithDot, ipBinaryWithoutDot, subnetMaskBinaryWithDot, subnetMaskBinaryWithoutDot, BroadcastID, NetworkID;
    private String[] ipBinaryOctets, subnetMaskBinaryOctets;

    private int CIDR = 0, numberOfHosts = 0;


    public Subnetter(String ip, String subnetMask) {
        this.ip = ip;
        this.subnetMask = subnetMask;
        this.CIDR = 0;
    }

    public Subnetter(String ip, int CIDR) {
        this.ip = ip;
        this.CIDR = CIDR;
    }

    // Methods
    public void getIpBinary() {
        this.ipBinaryOctets = new String[4];
        // Split the IP
        String[] octets = this.ip.split("\\.");
        // Convert each octet to binary
        this.ipBinaryOctets[0] = Binary.fromDecimalToBinary(octets[0]);
        this.ipBinaryOctets[1] = Binary.fromDecimalToBinary(octets[1]);
        this.ipBinaryOctets[2] = Binary.fromDecimalToBinary(octets[2]);
        this.ipBinaryOctets[3] = Binary.fromDecimalToBinary(octets[3]);
        // Concatenate the binary octets
        this.ipBinaryWithDot = this.ipBinaryOctets[0] + "." + this.ipBinaryOctets[1] + "." + this.ipBinaryOctets[2] + "." + this.ipBinaryOctets[3];
        // Concatenate the binary octets without dot
        this.ipBinaryWithoutDot = this.ipBinaryOctets[0] + this.ipBinaryOctets[1] + this.ipBinaryOctets[2] + this.ipBinaryOctets[3];
    }

    public void getSubnetMaskBinary() {
        this.subnetMaskBinaryOctets = new String[4];
        // Split the subnet mask
        String[] octets = this.subnetMask.split("\\.");
        // Convert each octet to binary
        this.subnetMaskBinaryOctets[0] = Binary.fromDecimalToBinary(octets[0]);
        this.subnetMaskBinaryOctets[1] = Binary.fromDecimalToBinary(octets[1]);
        this.subnetMaskBinaryOctets[2] = Binary.fromDecimalToBinary(octets[2]);
        this.subnetMaskBinaryOctets[3] = Binary.fromDecimalToBinary(octets[3]);
        // Concatenate the binary octets
        this.subnetMaskBinaryWithDot = this.subnetMaskBinaryOctets[0] + "." + this.subnetMaskBinaryOctets[1] + "." + this.subnetMaskBinaryOctets[2] + "." + this.subnetMaskBinaryOctets[3];
        // Concatenate the binary octets without dot
        this.subnetMaskBinaryWithoutDot = this.subnetMaskBinaryOctets[0] + this.subnetMaskBinaryOctets[1] + this.subnetMaskBinaryOctets[2] + this.subnetMaskBinaryOctets[3];
    }

    public void getCIDR() {
        this.CIDR = 0;
        for (int i = 0; i < this.subnetMaskBinaryWithoutDot.length(); i++) {
            if (this.subnetMaskBinaryWithoutDot.charAt(i) == '1') {
                this.CIDR++;
            }
        }
    }

    public void getSubnetMask() {
        this.subnetMask = "";
        for (int i = 0; i < this.CIDR; i++) {
            this.subnetMask += "1";
        }
        for (int i = 0; i < 32 - this.CIDR; i++) {
            this.subnetMask += "0";
        }
        this.subnetMask = Binary.fromBinaryToDecimal(this.subnetMask.substring(0, 8)) + "." + Binary.fromBinaryToDecimal(this.subnetMask.substring(8, 16)) + "." + Binary.fromBinaryToDecimal(this.subnetMask.substring(16, 24)) + "." + Binary.fromBinaryToDecimal(this.subnetMask.substring(24, 32));
    }

    public void getNetworkID() {
        String temp = "";
        for (int i = 0; i < this.ipBinaryWithoutDot.length(); i++) {
            if (this.ipBinaryWithoutDot.charAt(i) == '1' && this.subnetMaskBinaryWithoutDot.charAt(i) == '1') {
                temp += "1";
            } else {
                temp += "0";
            }
        }
        this.NetworkID = Binary.fromBinaryToDecimal(temp.substring(0, 8)) + "." + Binary.fromBinaryToDecimal(temp.substring(8, 16)) + "." + Binary.fromBinaryToDecimal(temp.substring(16, 24)) + "." + Binary.fromBinaryToDecimal(temp.substring(24, 32));

    }

    public void getBroadcastID() {
        String temp = "";
        for (int i = 0; i < this.ipBinaryWithoutDot.length(); i++) {
            if (this.ipBinaryWithoutDot.charAt(i) == '1' || this.subnetMaskBinaryWithoutDot.charAt(i) == '0') {
                temp += "1";
            } else {
                temp += "0";
            }
        }
        this.BroadcastID = Binary.fromBinaryToDecimal(temp.substring(0, 8)) + "." + Binary.fromBinaryToDecimal(temp.substring(8, 16)) + "." + Binary.fromBinaryToDecimal(temp.substring(16, 24)) + "." + Binary.fromBinaryToDecimal(temp.substring(24, 32));
    }

    public void getNumberOfHosts() {
        this.numberOfHosts = (int) Math.pow(2, 32 - this.CIDR) - 2;
    }


    public String toString() {
        return "IP: " + utils.populateString(this.ip) + "\n"
                + "IP Binary: " + utils.populateString(this.ipBinaryWithDot) + "\n"
                + "Subnet Mask: " + utils.populateString(this.subnetMask) + "\n"
                + "Subnet Mask Binary: " + utils.populateString(this.subnetMaskBinaryWithDot) + "\n"
                + "Network ID: " + utils.populateString(this.NetworkID) + "\n"
                + "Broadcast ID: " + utils.populateString(this.BroadcastID) + "\n"
                + "Number of Hosts: " + this.numberOfHosts + "\n"
                + "CIDR: " + this.CIDR + "\n";
    }
}