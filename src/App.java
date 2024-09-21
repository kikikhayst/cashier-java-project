import java.util.*;

class DaftarMenuRibet{
    static void bar1(){
        // untuk memunculkan bar Menu

        // untuk menampilkan garis diatas tulisan menu
        for (int a=1; a<=46; a++){
            System.out.print("-");
        }

         // untuk menampilkan garis tegak disamping sebelum tulisan menu
        System.out.println("");
        System.out.print("|");

         // untuk menampilkan tulisan judul dan nama warung dan di posisi tengah
        for (int b=1; b<=1; b++){
            for (int c=1; c<=2; c++){
                System.out.print(" ");
            }
            for (int d=1; d<=1; d++){
                System.out.print("WARUNG MAKAN SERBA ADA DAN SERBA KEJUTAN");
            }
            for (int e=1; e<=2; e++){
                System.out.print(" ");
            }
        }

        System.out.print("|");
        System.out.println("");
        System.out.print("|");

        for (int b=1; b<=1; b++){
            for (int c=1; c<=17; c++){
                System.out.print(" ");
            }
            for (int d=1; d<=1; d++){
                System.out.print("PAK RIZQI");
            }
            for (int e=1; e<=18; e++){
                System.out.print(" ");
            }
        }

        // untuk menampilkan garis tegak disamping sesudah tulisan menu
        System.out.print("|");
        System.out.println("");

        for (int a=1; a<=46; a++){
            System.out.print("-");
        }

        System.out.println("");
        // untuk menampilkan daftar menu
        String[]Makanan={"Nasi Liwet ","Nasi Sayur ","Nasi Goreng","Nasi Rames ","Nasi Rawon ","Nasi Pecel "};
        String[]Harga={"10000","7000 ","11000","9000 ","8500 ","7500 "};
        
        // menampilkan menu
        for (int f=0; f<Makanan.length; f++){
            int g=f+1; // karna  nomor array pertama yaitu 0
            System.out.println("| "+g+". "+Makanan[f]+"                  Rp."+Harga[f]+",- |");
        }
        for (int a=1; a<=46; a++){
            System.out.print("-");
        }
    }
    static void bar2(){
        Scanner input = new Scanner(System.in);
        // memasukkan variable
        String jawab="y", makanan="", bonus="";
        int total=0, pesan=0, harga=0, jumlah=0;
        String[]Makanan={"Nasi Liwet ","Nasi Sayur ","Nasi Goreng","Nasi Rames ","Nasi Rawon ","Nasi Pecel "};
        int Harga[]={10000,7000,11000,9000,8500,7500};
        String[]Bonus={"Sprite dan Tempe 2","Coca Cola dan Perkedel 2","Fanta dan Tahu 3","Pepsi dan Bakwan 3","McFloat dan Permen 5","Kinderjoy dan CadBury Milk"};

        // memasukkan nomor makanan yang akan dipesan
        // bila nomor tidak tercantum, akan otomatis mengulang
        do{
            do{
                System.out.println("");
                System.out.print("Silakan memilih makanan (1 s/d 6) = ");
                pesan = input.nextInt();
                try{
                    int data = pesan-1;
                    makanan = Makanan[data];
                    harga = Harga[data];
                    bonus = Bonus[data];
                } catch(Exception e){
                    System.out.println("");
                    System.out.println("Maaf, menu hanya sampai nomer 6");
                    System.out.println("Silakan pesan kembali");
                    
                }
            } while(pesan>6);

            System.out.println("");
            System.out.println("Makanan Pesanan = "+makanan);
            System.out.println("Harga Makanan   = Rp."+harga+",-");
            System.out.println("Bonus Makanan   = "+bonus);

            int totalharga, jumlahpesanan;

            System.out.print("Jumlah Pesanan  = ");
            jumlahpesanan = input.nextInt();

            totalharga  = jumlahpesanan * harga;
            total  = totalharga    + total;
            jumlah = jumlahpesanan + jumlah;

            System.out.println("Total Harga     = Rp."+totalharga+",-");
            System.out.println();
            System.out.print("Apakah anda ingin memesan kembali ? (y/t) = ");
            jawab=input.next();

        } while (jawab.equals("Y")|| jawab.equals("y"));

        System.out.println("Total Pembayaran = Rp."+total+",-");
        int kembalian;
        do {
            System.out.println("");
            System.out.print("Bayar = Rp.");
            int bayar=input.nextInt();
            
            kembalian = bayar - total;
            if (kembalian >= 0){
                System.out.println("Kembalian = Rp."+kembalian+",-");
            } else {
                System.out.println("Maaf, Uang anda kurang Rp."+kembalian+",-");
            }
        } while ( kembalian< 0);

        System.out.println("");
        for (int a=1; a<=1; a++){
            for (int b=1; b<=4; b++){
                System.out.print("=");
            }
            for (int c=1; c<=1; c++){
                System.out.print(" Terimakasih sudah memesan ");
            }
            for (int b=1; b<=4; b++){
                System.out.print("=");
            }
        }
        System.out.println("");
        System.out.println("");
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String ulang = "y";
       
        do {

            bar1();
            bar2();

            System.out.print("Masih Buka ? ");
            ulang = input.next();
        } while (ulang.equals("Y")|| ulang.equals("y"));
    }
}