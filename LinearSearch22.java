import java.util.Scanner;

public class LinearSearch22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array : ");
        
        int n = sc.nextInt();
        int arrayInt[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen array ke-"+(i)+" : ");
            arrayInt[i] = sc.nextInt();
        }
      
        System.out.print("Masukkan nilai array yang ingin dicari : ");
        int key = sc.nextInt();

        int hasil = 0;
        boolean nilaiDitemukan = false;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                nilaiDitemukan = true;
                break;
            }
        }

        if (nilaiDitemukan) {
            System.out.println("Nilai key ditemukan pada indeks ke : " + hasil);
        } else {
            System.out.println("Nilai key tidak ditemukan");
        }
    }

}    
    