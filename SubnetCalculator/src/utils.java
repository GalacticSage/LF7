public class utils {
    public static String populateString(String string) {
        if (string == null) {
            return "Not available";
        }
        return string;
    }

    public static boolean checkIP(String IP) {
        String[] octets = IP.split("\\.");
        if (octets.length != 4) {
            return false;
        } else if (Integer.parseInt(octets[0]) > 255 || Integer.parseInt(octets[1]) > 255 || Integer.parseInt(octets[2]) > 255 || Integer.parseInt(octets[3]) > 255) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkCIDR(int CIDR) {
        if (CIDR < 0 || CIDR > 32) {
            return false;
        } else {
            return true;
        }
    }
}
