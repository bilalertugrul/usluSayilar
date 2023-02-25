import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number, total=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        number = input.nextInt();

        for (int i=1 ; i<=number ; i++){
            total *= number;
            System.out.println(number + "^" + i + " = " + total);
        }

    }
}