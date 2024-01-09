public class IpChecker {
    public static boolean isIpAdresseCorrect(String ipAdresse) {
        String ipRegex = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
        return ipAdresse.matches(ipRegex);
    }

    public static boolean isMaskCorrect(String subnetMask) {
        String maskRegex = "^(255)\\.(0|128|192|224|240|248|252|254|255)\\.(0|128|192|224|240|248|252|254|255)\\.(0|128|192|224|240|248|252|254|255)";
        return subnetMask.matches(maskRegex);
    }

    public static boolean isCidrCorrect(int cidr) {
        return cidr >= 0 && cidr <= 32;
    }
}
