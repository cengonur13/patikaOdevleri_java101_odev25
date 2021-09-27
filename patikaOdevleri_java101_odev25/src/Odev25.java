import java.util.Scanner;

public class Odev25 {
    /**
     * @author Onur TAŞ, 2021...
     * -Basic ATM project-
     */
    public static void main(String[] args) {
        String userName, password;
        int right=3;
        int select;
        int balance=1500,price;

        Scanner scanner = new Scanner(System.in);

        while (right > 0){

            System.out.print("Kullanıcı Adınız : ");
            userName = scanner.nextLine();
            System.out.print("Şifre : ");
            password = scanner.nextLine();

            // program modüllere ayrılıp daha kullanılabilir ve okunabilir hale getirilebilir...

            if(userName.equals("patika") && password.equals("java101")){
                System.out.println("Sisteme başarılı bir şekilde giriş yaptınız!");
                System.out.println("" +
                        "------------------" +
                        "\nMerhaba, X Bankasına hoş geldiniz! Menüye Aktarılıyorsunuz..." +
                        "\n------------------");
                do {
                    System.out.println("*****************");
                    System.out.println("1- Para Yatırma" +
                            "\n2- Para Çekme" +
                            "\n3- Bakiye Sorgulama" +
                            "\n4- Çıkış");
                    System.out.print("İşlem Seçimi : ");
                    select = scanner.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Para Miktarı : ");
                            price = scanner.nextInt();
                            if(price >= 0){
                                balance += price;
                                System.out.println(price+" miktarda para yatırıldı!");
                            }else{
                                System.out.println("Yanlış Miktar Girişi...");
                            }
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = scanner.nextInt();
                            if(price > balance){
                                System.out.println("Yetersiz Bakiye...");
                            }else {
                                balance -= price;
                                System.out.println(price+" miktarda para çekildi!");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;
                        default:
                            System.out.println("Yanlış Seçim Yaptınız...");
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;
            }else {
                right--;
                if(right == 0){
                    System.out.println("Giriş Hakkınız dolmuştur. " +
                            "Hesabınız bloke edildi, Lütfen banka ile iletişime geçiniz...");
                }else {
                    System.out.println("Hatalı Giriş! Kalan Giriş Hakkınız : "+right);
                }
            }
        }

    }
}
