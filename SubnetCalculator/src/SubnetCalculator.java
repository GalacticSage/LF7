public class SubnetCalculator {
    private IpAdresse ipAdresse;
    private SubnetMask subnetMask;

    public SubnetCalculator(String ipAdresse, String subnetMask) {
        this.ipAdresse = new IpAdresse(ipAdresse);
        this.subnetMask = new SubnetMask(subnetMask);
    }

    public SubnetCalculator(String ipAdresse, int cidr) {
        this.ipAdresse = new IpAdresse(ipAdresse);
        this.subnetMask = new SubnetMask(cidr);
    }

    public String getNetAddress() {
        String[] networkBinaryOctets = new String[4];
        String[] ipBinaryOctets = this.ipAdresse.getBinaryAdresse().split("\\.");
        String[] maskBinaryOctets = this.subnetMask.getBinaryMask().split("\\.");
        for (int i = 0; i < 4; i++) {
            networkBinaryOctets[i] = "";
            for (int j = 0; j < 8; j++) {
                if (ipBinaryOctets[i].charAt(j) == '1' && maskBinaryOctets[i].charAt(j) == '1') {
                    networkBinaryOctets[i] += "1";
                } else {
                    networkBinaryOctets[i] += "0";
                }
            }
        }
        return NumberConverter.fromBinaryToDecimal(networkBinaryOctets[0]) + "." + NumberConverter.fromBinaryToDecimal(networkBinaryOctets[1]) + "." + NumberConverter.fromBinaryToDecimal(networkBinaryOctets[2]) + "." + NumberConverter.fromBinaryToDecimal(networkBinaryOctets[3]);
    }

    public String getBroadcast() {
        String[] broadcastBinaryOctets = new String[4];
        String[] ipBinaryOctets = this.ipAdresse.getBinaryAdresse().split("\\.");
        String[] maskBinaryOctets = this.subnetMask.getBinaryMask().split("\\.");
        for (int i = 0; i < 4; i++) {
            broadcastBinaryOctets[i] = "";
            for (int j = 0; j < 8; j++) {
                if (ipBinaryOctets[i].charAt(j) == '1' || maskBinaryOctets[i].charAt(j) == '0') {
                    broadcastBinaryOctets[i] += "1";
                } else {
                    broadcastBinaryOctets[i] += "0";
                }
            }
        }
        return NumberConverter.fromBinaryToDecimal(broadcastBinaryOctets[0]) + "." + NumberConverter.fromBinaryToDecimal(broadcastBinaryOctets[1]) + "." + NumberConverter.fromBinaryToDecimal(broadcastBinaryOctets[2]) + "." + NumberConverter.fromBinaryToDecimal(broadcastBinaryOctets[3]);
    }

    public int getNumberOfHosts() {
        return (int) Math.pow(2, 32 - this.subnetMask.getCidr()) - 2;
    }

    public String toString(boolean isMask) {
        String str = "";
        str += "IP Adresse: " + this.ipAdresse.getAdresse() + "\n";
        if (isMask) {

            str += "Subnet Mask: " + this.subnetMask.getMask() + "\n";
            str += "CIDR: " + this.subnetMask.getCidr(this.subnetMask.getBinaryMask()) + "\n";
        } else {
            this.subnetMask.getMask(this.subnetMask.getCidr());
            str += "Subnet Mask: " + this.subnetMask.getMask(this.subnetMask.getCidr()) + "\n";
            str += "CIDR: " + this.subnetMask.getCidr() + "\n";

        }
        str += "Net Address: " + this.getNetAddress() + "\n";
        str += "Broadcast: " + this.getBroadcast() + "\n";
        str += "Number of Hosts: " + this.getNumberOfHosts() + "\n";
        return str;
    }
}
