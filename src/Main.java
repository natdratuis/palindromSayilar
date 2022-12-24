import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int kontrol=scanner.nextInt();
        isPalindrom(kontrol);

    }

    static void isPalindrom(int sayi){
        int tersSayi=0, hafiza=sayi;
        while (hafiza!=0){
            tersSayi=tersSayi+(hafiza%10);
            hafiza/=10;
            tersSayi=tersSayi*10;
        }
        tersSayi=tersSayi/10;
        if (sayi==tersSayi){
            System.out.println("Palindrom sayidir.");
        }else {
            System.out.println("Palindrom değildir.");
        }
    }
}