import java.util.Scanner;

public class TugasJobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahElemen;
        System.out.print("Masukkan jumlah elemen array anda : ");
        jumlahElemen = sc.nextInt();

        int arrayNilai[] = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai dari elemen array ke -" + i + " : ");
            arrayNilai[i] = sc.nextInt();
        }

        if (jumlahElemen > 0) {
            int nilaiTinggi = arrayNilai[0];
            int nilaiRendah = arrayNilai[0];
            int total = arrayNilai[0];

            for (int i = 1; i < jumlahElemen; i++) {
                if (arrayNilai[i] > nilaiTinggi) {
                    nilaiTinggi = arrayNilai[i];
                }
                if (arrayNilai[i] < nilaiRendah) {
                    nilaiRendah = arrayNilai[i];
                }
                total += arrayNilai[i];
            }

            double rata2 = (double) total / jumlahElemen;

            System.out.println("Nilai tertinggi: " + nilaiTinggi);
            System.out.println("Nilai terendah: " + nilaiRendah);
            System.out.println("Nilai rata-rata: " + rata2);
        } 
    }
}

