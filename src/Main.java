import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Hesaplar hesap0 = new Hesaplar(0, 100);
        Hesaplar hesap1 = new Hesaplar(1, 100);
        Hesaplar hesap2 = new Hesaplar(2, 100);
        Hesaplar hesap3 = new Hesaplar(3, 100);
        Hesaplar hesap4 = new Hesaplar(4, 100);
        Hesaplar hesap5 = new Hesaplar(5, 100);
        Hesaplar hesap6 = new Hesaplar(6, 100);
        Hesaplar hesap7 = new Hesaplar(7, 100);
        Hesaplar hesap8 = new Hesaplar(8, 100);
        Hesaplar hesap9 = new Hesaplar(9, 100);
        
        Scanner input = new Scanner(System.in);
        int id, secim, miktar;
        
        
        
        while (true) {
            System.out.print("ID : ");
            id = input.nextInt();            
            if(id >= 0 && id <= 9)
            {
                System.out.println("1- Bakiye Görüntüle \n" + "2- Para Çekme \n"
                                 + "3- Para Yatırma \n" + "4- Çıkış");
                System.out.print("Seçim(1-4) : ");
                secim = input.nextInt();
                switch (id){
                    case 0:
                        if(secim == 1){
                            System.out.println(hesap0.getBakiye());
                        }else if(secim == 2){
                            System.out.print("Çekilecek Miktar : ");
                            miktar = input.nextInt();
                            hesap0.paraCek(miktar);
                        }else if(secim == 3){
                            System.out.print("Yatırılacak Miktar : ");
                            miktar = input.nextInt();
                            hesap0.paraYatir(miktar);
                        }else if(secim == 4){
                            System.out.println(hesap0.getBakiye()+hesap1.getBakiye()
                            +hesap2.getBakiye()+hesap3.getBakiye()+hesap4.getBakiye()
                            +hesap5.getBakiye()+hesap6.getBakiye()+hesap7.getBakiye()
                            +hesap8.getBakiye()+hesap9.getBakiye());
                        }else{
                            System.out.println("Geçersiz Seçenek");
                        }
                        break;
                    case 1:
                        if(secim == 1){
                            System.out.println(hesap1.getBakiye());
                        }else if(secim == 2){
                            System.out.print("Çekilecek Miktar : ");
                            miktar = input.nextInt();
                            hesap1.paraCek(miktar);
                        }else if(secim == 3){
                            System.out.print("Yatırılacak Miktar : ");
                            miktar = input.nextInt();
                            hesap1.paraYatir(miktar);
                        }else if(secim == 4){
                            System.out.println(hesap0.getBakiye()+hesap1.getBakiye()
                            +hesap2.getBakiye()+hesap3.getBakiye()+hesap4.getBakiye()
                            +hesap5.getBakiye()+hesap6.getBakiye()+hesap7.getBakiye()
                            +hesap8.getBakiye()+hesap9.getBakiye());
                        }else{
                            System.out.println("Geçersiz Seçenek");
                        }
                        break;
                    case 2:
                        if(secim == 1){
                            System.out.println(hesap2.getBakiye());
                        }else if(secim == 2){
                            System.out.print("Çekilecek Miktar : ");
                            miktar = input.nextInt();
                            hesap2.paraCek(miktar);
                        }else if(secim == 3){
                            System.out.print("Yatırılacak Miktar : ");
                            miktar = input.nextInt();
                            hesap2.paraYatir(miktar);
                        }else if(secim == 4){
                            System.out.println(hesap0.getBakiye()+hesap1.getBakiye()
                            +hesap2.getBakiye()+hesap3.getBakiye()+hesap4.getBakiye()
                            +hesap5.getBakiye()+hesap6.getBakiye()+hesap7.getBakiye()
                            +hesap8.getBakiye()+hesap9.getBakiye());
                        }else{
                            System.out.println("Geçersiz Seçenek");
                        }
                        break;
                    case 4:
                        if(secim == 1){
                            System.out.println(hesap4.getBakiye());
                        }else if(secim == 2){
                            System.out.print("Çekilecek Miktar : ");
                            miktar = input.nextInt();
                            hesap4.paraCek(miktar);
                        }else if(secim == 3){
                            System.out.print("Yatırılacak Miktar : ");
                            miktar = input.nextInt();
                            hesap4.paraYatir(miktar);
                        }else if(secim == 4){
                            System.out.println(hesap0.getBakiye()+hesap1.getBakiye()
                            +hesap2.getBakiye()+hesap3.getBakiye()+hesap4.getBakiye()
                            +hesap5.getBakiye()+hesap6.getBakiye()+hesap7.getBakiye()
                            +hesap8.getBakiye()+hesap9.getBakiye());
                        }else{
                            System.out.println("Geçersiz Seçenek");
                        }
                        break;
                    case 5:
                        if(secim == 1){
                            System.out.println(hesap5.getBakiye());
                        }else if(secim == 2){
                            System.out.print("Çekilecek Miktar : ");
                            miktar = input.nextInt();
                            hesap5.paraCek(miktar);
                        }else if(secim == 3){
                            System.out.print("Yatırılacak Miktar : ");
                            miktar = input.nextInt();
                            hesap5.paraYatir(miktar);
                        }else if(secim == 4){
                            System.out.println(hesap0.getBakiye()+hesap1.getBakiye()
                            +hesap2.getBakiye()+hesap3.getBakiye()+hesap4.getBakiye()
                            +hesap5.getBakiye()+hesap6.getBakiye()+hesap7.getBakiye()
                            +hesap8.getBakiye()+hesap9.getBakiye());
                        }else{
                            System.out.println("Geçersiz Seçenek");
                        }
                        break;
                    case 6:
                        if(secim == 1){
                            System.out.println(hesap6.getBakiye());
                        }else if(secim == 2){
                            System.out.print("Çekilecek Miktar : ");
                            miktar = input.nextInt();
                            hesap6.paraCek(miktar);
                        }else if(secim == 3){
                            System.out.print("Yatırılacak Miktar : ");
                            miktar = input.nextInt();
                            hesap6.paraYatir(miktar);
                        }else if(secim == 4){
                            System.out.println(hesap0.getBakiye()+hesap1.getBakiye()
                            +hesap2.getBakiye()+hesap3.getBakiye()+hesap4.getBakiye()
                            +hesap5.getBakiye()+hesap6.getBakiye()+hesap7.getBakiye()
                            +hesap8.getBakiye()+hesap9.getBakiye());
                        }else{
                            System.out.println("Geçersiz Seçenek");
                        }
                        break;
                    case 7:
                        if(secim == 1){
                            System.out.println(hesap7.getBakiye());
                        }else if(secim == 2){
                            System.out.print("Çekilecek Miktar : ");
                            miktar = input.nextInt();
                            hesap7.paraCek(miktar);
                        }else if(secim == 3){
                            System.out.print("Yatırılacak Miktar : ");
                            miktar = input.nextInt();
                            hesap7

                                    .paraYatir(miktar);
                        }else if(secim == 4){
                            System.out.println(hesap0.getBakiye()+hesap1.getBakiye()
                            +hesap2.getBakiye()+hesap3.getBakiye()+hesap4.getBakiye()
                            +hesap5.getBakiye()+hesap6.getBakiye()+hesap7.getBakiye()
                            +hesap8.getBakiye()+hesap9.getBakiye());
                        }else{
                            System.out.println("Geçersiz Seçenek");
                        }
                        break;
                    case 8:
                        if(secim == 1){
                            System.out.println(hesap8.getBakiye());
                        }else if(secim == 2){
                            System.out.print("Çekilecek Miktar : ");
                            miktar = input.nextInt();
                            hesap8.paraCek(miktar);
                        }else if(secim == 3){
                            System.out.print("Yatırılacak Miktar : ");
                            miktar = input.nextInt();
                            hesap8.paraYatir(miktar);
                        }else if(secim == 4){
                            System.out.println(hesap0.getBakiye()+hesap1.getBakiye()
                            +hesap2.getBakiye()+hesap3.getBakiye()+hesap4.getBakiye()
                            +hesap5.getBakiye()+hesap6.getBakiye()+hesap7.getBakiye()
                            +hesap8.getBakiye()+hesap9.getBakiye());
                        }else{
                            System.out.println("Geçersiz Seçenek");
                        }
                        break;
                    case 9:
                        if(secim == 1){
                            System.out.println(hesap9.getBakiye());
                        }else if(secim == 2){
                            System.out.print("Çekilecek Miktar : ");
                            miktar = input.nextInt();
                            hesap9.paraCek(miktar);
                        }else if(secim == 3){
                            System.out.print("Yatırılacak Miktar : ");
                            miktar = input.nextInt();
                            hesap9.paraYatir(miktar);
                        }else if(secim == 4){
                            System.out.println(hesap0.getBakiye()+hesap1.getBakiye()
                            +hesap2.getBakiye()+hesap3.getBakiye()+hesap4.getBakiye()
                            +hesap5.getBakiye()+hesap6.getBakiye()+hesap7.getBakiye()
                            +hesap8.getBakiye()+hesap9.getBakiye());
                        }else{
                            System.out.println("Geçersiz Seçenek");
                        }
                        break;
                }
            }
            else
            {
                System.out.println("Geçersiz ID");
            }
        }
        
        
        
        
                
        
        
    }
    
}
