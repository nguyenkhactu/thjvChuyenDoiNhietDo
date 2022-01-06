import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        double nhietc;
        double nhietf;
        int luaChon;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu.");
            System.out.println("1. chuyển độ C sang độ F");
            System.out.println("2. chuyển độ F sang độ C");
            System.out.println("0. Exit");
            System.out.println("chọn lựa chọn của bạn: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1: {
                    System.out.println("độ F của bạn ");
                    nhietf = sc.nextDouble();
                    System.out.println("độ C của bạn là " + fsangc(nhietf));
                    break;
                }
                case 2: {
                    System.out.println("độ C của bạn ");
                    nhietc = sc.nextDouble();
                    System.out.println("độ F của bạn là " + csangf(nhietc));
                    break;
                }
                case 0:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + luaChon);
            }
        }
        while (luaChon != 0);


    }
    public static double fsangc ( double nhietf){
        double doC = (9.0 / 5) * nhietf + 32;
        return doC;
    }
    public static double csangf ( double nhietc){
        double doF = (5.0 / 9) * (nhietc - 32);
        return doF;
    }
}
