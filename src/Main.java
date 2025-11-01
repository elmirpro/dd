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

    static void showBalance(double balans){
        int allCoin = (int) (balans * 100);
        int manat = allCoin / 100;
        int coin = allCoin % 100;
        System.out.println("Balanınız: " + manat + " manat, " + coin + " qəpik.");
    }

    static double cash(double balans){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a <= 0){
            System.out.println("Çıxarmaq mümkün olmadı!");
            return a;
        }
        else if (a > balans) {
            System.out.println("Çıxarmaq mümkün olmadı!");
            return a;
        }
        return balans - a;
    }

    public static void main(String[] args) {
        showBalance(77.8);
        System.out.println(menu());
        System.out.println(cash(67));
    }
}