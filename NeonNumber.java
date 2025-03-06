import java.util.Scanner;

public class NeonNumberChecker {

    public static void main(String[] args) {
        // Kullanıcıdan sayı alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();
        
        // Neon Number kontrolünü yapıyoruz
        if (isNeonNumber(num)) {
            System.out.println(num + " bir Neon Number'dır.");
        } else {
            System.out.println(num + " bir Neon Number değildir.");
        }
        
        scanner.close();
    }

    // Neon Number kontrolü yapan fonksiyon
    public static boolean isNeonNumber(int num) {
        // Sayının karesini alıyoruz
        int square = num * num;
        int sum = 0;

        // Karekökün rakamlarını topluyoruz
        while (square != 0) {
            sum += square % 10;  // Son basamağı al
            square /= 10;        // Sayıyı 10'a böl
        }

        // Eğer rakamların toplamı num'a eşitse, Neon Number
        return sum == num;
    }
}
