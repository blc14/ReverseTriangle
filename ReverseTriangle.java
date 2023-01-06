import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);
        int sayi;
        System.out.println("Ucgenin uzun kenarini giriniz: ");
        sayi = imp.nextInt();
        for (int i = 0; i < sayi; i++) {
            for (int j = sayi - i; j > 0; j--) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}