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
    public static void main(String[] args) {
        int result = menu();
        System.out.println("***********************************************************************************************************************************************************");
        System.out.println(result);
    }
}