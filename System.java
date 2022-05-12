 import java.util.ArrayList;
 import java.util.Scanner;
 public class System {

//    New Scanner
     Scanner Input = new Scanner(java.lang.System.in);

//     Atribut dan Array
     private ArrayList<String> user = new ArrayList<String>();
     private int Menu;


//     Method menampilkan aksi yang dipilih oleh user
     public void tampilMenu(){
         java.lang.System.out.println("*********** || Pilihan Menu || ***********");
         java.lang.System.out.println("1. Masukan Data Pengunjung");
         java.lang.System.out.println("2. Tampilkan List Pengunjung");
         java.lang.System.out.println("3. Keluar");
         java.lang.System.out.print("Masukan Opsi: ");
         Menu = Input.nextInt();
         java.lang.System.out.println();
     }

//     Method untuk input data yang dimasukan user ke array
     private void masukanData(){
         java.lang.System.out.println("*********  || Input Data Pengunjung ||  *********");
             java.lang.System.out.println("Masukan Nama Pengunjung: ");
             String df = Input.next();
             user.add(df);
     }

//     Method untuk mengambil dan menampilkan data array
     private void tampilData(){
         int k = 1;
         java.lang.System.out.println("*********** || Daftar Pengunjung || ***********");
         java.lang.System.out.println();
         for (int i = 0; i < user.size(); i++){
             java.lang.System.out.println( k+i +" "+ user.get(i));
         }
         java.lang.System.out.println("Jumlah Pengunjung = " + user.size());
     }

//      Method untuk menangani inputan user

     public void getMenu(){
         Boolean quit = false;

         while (!quit){
            int opt = this.Menu;

             switch (opt){
                 case 1:
                     masukanData();
                     java.lang.System.out.println();
                     tampilMenu();
                     break;
                 case 2:
                     tampilData();
                     java.lang.System.out.println();
                     tampilMenu();
                     break;
                 case 3:
                     java.lang.System.out.println("********************************");
                     java.lang.System.out.println("*****  || Sampai Jumpa ||  *****");
                     java.lang.System.out.println("********************************");
                     quit = true;
             }
         }
     }
 }

