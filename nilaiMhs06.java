public class nilaiMhs06 {
    String nama;
    String nim;
    int TahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    nilaiMhs06 (String nama, String nim, int TahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.TahunMasuk = TahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // 1. Mencari Nilai UTS Tertinggi (Divide and Conquer) 
    int getNilaiUTSTertinggiDC(nilaiMhs06[] mhs, int l, int r) {
        if (l == r) { // Base case adalah kondisi di mana array sudah tidak bisa dibagi lagi karena hanya menyisakan satu elemen
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2; // Menghitung indeks tengah dari array untuk membagi menjadi dua bagian(divide)
        // conquer (menyelesaikan)
        int lmax = getNilaiUTSTertinggiDC(mhs, l, mid);
        int rmax = getNilaiUTSTertinggiDC(mhs, mid + 1, r);

        return (lmax > rmax) ? lmax : rmax; // Combine(menggabungkan)
    }

    // 2. Mencari Nilai UTS Terendah (Divide and Conquer) 
    int getNilaiUTSTerendahDC(nilaiMhs06[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lmin = getNilaiUTSTerendahDC(mhs, l, mid);
        int rmin = getNilaiUTSTerendahDC(mhs, mid + 1, r);
        
        return (lmin < rmin) ? lmin : rmin;
    }

    // 3. Menghitung Rata-rata UAS (Brute Force) 
    double getRataRataUAS(nilaiMhs06[] mhs) {
        int total = 0;
        for (int i = 0; i < mhs.length; i++) { 
            total =total + mhs[i].nilaiUAS;
        }
        return (double) total / mhs.length;
    }
}
