import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi= scanner.nextInt();
        scanner.close();
        int bolenlerToplami=0;

        for (int i = 1; i < sayi/2; i++) {
            if (sayi%i==0){
                bolenlerToplami+=i;
            }
        }
        if (sayi==bolenlerToplami){
            System.out.println(sayi + " Mükemmel sayıdır.✅");
        }else System.out.println(sayi + " Mükemmel sayı değildir.❌");
    }
}
