import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa yang ingin dimasukkan = ");
        int jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];
        int jumlahMhsLulus = 0, jumlahMhsTidak = 0, nilaiLulus = 0, nilaiTidak = 0, total = 0;
        double rataLulus = 0, rataTidak = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " Lulus!");
                jumlahMhsLulus++;
                nilaiLulus += nilaiMhs[i];
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " Tidak lulus!");
                jumlahMhsTidak++;
                nilaiTidak += nilaiMhs[i];
            }
            total += nilaiMhs[i];
        }

        rataLulus = (double)nilaiLulus / (double)jumlahMhsLulus;
        rataTidak = (double)nilaiTidak / (double)jumlahMhsTidak;

        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahMhsLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahMhsTidak);

        System.out.printf("Rata-rata nilai mahasiswa yang lulus = %.2f\n", rataLulus);
        System.out.printf("Rata-rata nilai mahasiswa yang tidak lulus = %.2f\n", rataTidak);
        
       
    }
}
