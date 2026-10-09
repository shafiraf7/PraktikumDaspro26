import java.util.Scanner;

public class StudiKasus126 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.println("masukan jumlah cup yang di beli");
        jumlahCup=sc.nextInt();
        System.out.println("uang yang di bayar");
        uangBayar=sc.nextInt();

        totalHarga=jumlahCup*hargaPerCup;
        diskon=0;
        totalBayar = totalHarga-diskon;
        if (totalHarga>=100000){
            diskon=totalHarga*10/100;
            
            System.out.println("Total" +totalBayar);
            if (uangBayar>=totalBayar){
                kembalian=uangBayar-totalBayar;
                System.out.println("kembalian" +kembalian);
                }else {
                    kurang=totalBayar-uangBayar;
                    System.out.println("Uang tidak cukup, kurang Rp" +kurang);

                }
            }
            System.out.println("Total harga" +totalHarga);
            System.out.println("Diskon" +diskon);
            System.out.println("Total bayar" +totalBayar);
            sc.close();
        } 

    }  
    
