import java.util.Scanner;

public class Main {

    static int menu() {
        System.out.println("***********");
        System.out.print("""
                1)Balans
                2)Nağdlaşdırma
                3)Balans Arttırma
                4)Çıxış
                5)Daxil Et:\s""");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        return a;
    }

    static void showBalance(double balance){
        int allCoin = (int) (balance * 100);
        int manat = allCoin / 100;
        int coin = allCoin % 100;
        System.out.println("Balanınız: " + manat + " manat, " + coin + " qəpik.");
    }

    static double cash(double balance){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****");
        System.out.print("Nağdlaşdırmaq istədiyiniz məbləği daxil edin: ");
        double a = scanner.nextDouble();
        if (a <= 0){
            System.out.println("Məbləğ yanlış daxil edilib!");
            return balance;
        }
        else if (a > balance) {
            System.out.println("Balansınızda kifayət qədər məbləğ mövcud deyil.");
            return balance;
        }

        return balance - a;
    }

    public static void main(String[] args) {
        showBalance(77.8);
        System.out.println(menu());
        System.out.println(cash(67));
    }
}