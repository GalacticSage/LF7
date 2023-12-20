public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided. Use -h or --help for help.");
            return;
        }else if ("-h".equals(args[0]) || "--help".equals(args[0])) {
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
            if (!utils.checkIP(IP)) {
                System.out.println("Invalid IP address.");
                return;
            }
            String subnetMask = args[2];
            if (!utils.checkIP(subnetMask)) {
                System.out.println("Invalid subnet mask.");
                return;
            }
            Subnetter subnetter = new Subnetter(IP, subnetMask);
            subnetter.getIpBinary();
            subnetter.getSubnetMaskBinary();
            subnetter.getCIDR();
            subnetter.getBroadcastID();
            subnetter.getNetworkID();
            subnetter.getNumberOfHosts();
            System.out.println("CALCULATING SUBNETS USING SUBNET MASK");
            System.out.println(subnetter.toString());
        } else if ("-cidr".equals(args[0])) {
            String IP = args[1];
            if (!utils.checkIP(IP)) {
                System.out.println("Invalid IP address.");
                return;
            }
            int CIDR = Integer.parseInt(args[2]);
            if (!utils.checkCIDR(CIDR)) {
                System.out.println("Invalid CIDR notation.");
                return;
            }
            Subnetter subnetter = new Subnetter(IP, CIDR);
            subnetter.getSubnetMask();
            subnetter.getIpBinary();
            subnetter.getSubnetMaskBinary();
            subnetter.getBroadcastID();
            subnetter.getNetworkID();
            subnetter.getNumberOfHosts();
            System.out.println("CALCULATING SUBNETS USING CIDR NOTATION");
            System.out.println(subnetter.toString());
        } else {
            System.out.println("Invalid argument. Use -h or --help for help.");
        }
    }
}