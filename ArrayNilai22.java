import java.util.Scanner;

public class ArrayNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir22 = new int[10];

        for (int i = 0; i < nilaiAkhir22; i++){
            if (nilaiAkhir22[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + );
            }
            System.out.print("Masukkan nilai akhir ke-"+i+": ");
            nilaiAkhir22[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
           if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-"+i+" lulus!");
           } else{
            System.out.println("Mahasiswa ke-"+i+" tidak lulus!");
           }
            
        }
    }
    
}