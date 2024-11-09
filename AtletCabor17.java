import java.util.Scanner;

public class AtletCabor17 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String nama, cabangOlahraga; 
    int i, j;

        i=1;
        while (i<=4) {
        System.out.print("Masukkan Cabang Olahraga ke " + i + " = ");
        cabangOlahraga = sc.nextLine();
            if (cabangOlahraga.equalsIgnoreCase("Badminton") || cabangOlahraga.equalsIgnoreCase("TenisMeja") || cabangOlahraga.equalsIgnoreCase("Basket") || cabangOlahraga.equalsIgnoreCase("Volley")) {
                System.out.println("Cabang Olahraga " + cabangOlahraga);
                for (j=1; j<=5;j++){
                System.out.print("Masukkan nama Atlet " + j + " = ");
                nama = sc.nextLine();
                }
            }
            System.out.println();
            i++;
        }
    }
}
