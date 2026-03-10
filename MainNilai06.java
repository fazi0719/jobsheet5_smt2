import java.util.Scanner;

public class MainNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Membersihkan buffer

        // Inisialisasi array of objects 
        nilaiMhs06[] daftarMhs = new nilaiMhs06[jumlah];

        // Input data berdasarkan tabel mahasiswa 
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama        : ");
            String nama = sc.nextLine();
            System.out.print("NIM         : ");
            String nim = sc.nextLine();
            System.out.print("Tahun Masuk : ");
            int tahun = sc.nextInt();
            System.out.print("Nilai UTS   : ");
            int uts = sc.nextInt();
            System.out.print("Nilai UAS   : ");
            int uas = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            daftarMhs[i] = new nilaiMhs06(nama, nim, tahun, uts, uas);
        }

        // Membuat objek pembantu untuk memanggil method instance
        nilaiMhs06 hitung = new nilaiMhs06("", "", 0, 0, 0);

       
        System.out.println("HASIL PENGOLAHAN DATA");
        

        // a) Nilai UTS tertinggi menggunakan Divide and Conquer [cite: 236]
        int tertinggi = hitung.getNilaiUTSTertinggiDC(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("Nilai UTS Tertinggi (DC) : " + tertinggi);

        // b) Nilai UTS terendah menggunakan Divide and Conquer [cite: 237]
        int terendah = hitung.getNilaiUTSTerendahDC(daftarMhs, 0, daftarMhs.length - 1);
        System.out.println("Nilai UTS Terendah (DC)  : " + terendah);

        // c) Rata-rata nilai UAS menggunakan Brute Force 
        double rataUAS = hitung.getRataRataUAS(daftarMhs);
        System.out.printf("Rata-rata Nilai UAS (BF) : %.2f\n", rataUAS);
        
       
    }
}