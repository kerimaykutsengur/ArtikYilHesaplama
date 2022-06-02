import java.util.Scanner;

public class ArtikYilHesaplamaProgrami {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print(year + "artık bir yıldır!");
                } else {
                    System.out.print(year + "artık bir yıl değildir!");
                }
            } else {
                System.out.print(year + "artık bir yıldır!");
            }
        } else {
            System.out.print(year + "artık bir yıl değildir!");
        }


    }
}
