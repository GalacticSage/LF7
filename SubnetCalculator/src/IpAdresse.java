public class IpAdresse {
    private String adresse;

    public IpAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getBinaryAdresse() {
        String[] ipBinaryOctets = new String[4];
        // Split the IP
        String[] octets = this.adresse.split("\\.");
        // Convert each octet to binary
        ipBinaryOctets[0] = NumberConverter.fromDecimalToBinary(octets[0]);
        ipBinaryOctets[1] = NumberConverter.fromDecimalToBinary(octets[1]);
        ipBinaryOctets[2] = NumberConverter.fromDecimalToBinary(octets[2]);
        ipBinaryOctets[3] = NumberConverter.fromDecimalToBinary(octets[3]);
        // Concatenate the binary octets
        return ipBinaryOctets[0] + "." + ipBinaryOctets[1] + "." + ipBinaryOctets[2] + "." + ipBinaryOctets[3];
    }



    @Override
    public String toString() {
        return "IP Adresse: " + this.adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
