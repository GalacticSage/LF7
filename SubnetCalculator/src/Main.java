public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided. Use -h or --help for help.");
        } else if ("-h".equals(args[0]) || "--help".equals(args[0])) {
            System.out.println();
            System.out.println("Options:");
            System.out.println("  -mask\t\t\t\tUse a subnet mask to subnet the IP address");
            System.out.println("  -cidr\t\t\t\tUse CIDR notation to subnet the IP address");
            System.out.println("  -h, --help\t\t\tDisplay this help message and exit");
            System.out.println("  -v, --version\t\t\tDisplay version information and exit");
            System.out.println();
            System.out.println("Examples:");
            System.out.println("SUBNETMASK METHOD: \njava -jar SubnetCalculator.jar -mask 192.168.1.1 255.255.255.0");
            System.out.println("CIDR METHOD: \njava -jar SubnetCalculator.jar -cidr 192.168.1.1 24");
        } else if ("-v".equals(args[0]) || "--version".equals(args[0])) {
            System.out.println("Version 1.0.0");
            System.out.println("Written by: Johann S.");
        } else if ("-mask".equals(args[0])) {
            String IP = args[1];
            String subnetMask = args[2];
            if (IP == null || subnetMask == null) {
                System.out.println("Invalid arguments. Use -h or --help for help.");
                return;
            }
            if (!IpChecker.isIpAdresseCorrect(IP) || !IpChecker.isMaskCorrect(subnetMask)) {
                System.out.println("Invalid IP address or Subnet Mask. Use -h or --help for help.");
                return;
            }
            SubnetCalculator subnetCalculator = new SubnetCalculator(IP, subnetMask);
            System.out.println(subnetCalculator.toString(true));
        } else if ("-cidr".equals(args[0])) {
            String IP = args[1];
            int cidr = Integer.parseInt(args[2]);
            if (IP == null || cidr == 0) {
                System.out.println("Invalid arguments. Use -h or --help for help.");
                return;
            }
            if (!IpChecker.isIpAdresseCorrect(IP) || !IpChecker.isCidrCorrect(cidr)) {
                System.out.println("Invalid IP address or CIDR. Use -h or --help for help.");
                return;
            }
            SubnetCalculator subnetCalculator = new SubnetCalculator(IP, cidr);
            System.out.println(subnetCalculator.toString(false));
        } else {
            System.out.println("Invalid arguments. Use -h or --help for help.");
        }
    }
}