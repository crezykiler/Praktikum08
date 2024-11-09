import java.util.Scanner;

public class Persegi17 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukkan nilai N : ");
    int N = sc.nextInt();

    if (N < 3) {
        System.out.print("Nilai N minimal 3");
        return;
    }

    int i = 0;
    while (i < N) {
        int j = 0;
            while (j < N) {
                if (i==0 || i==N -1||j==0||j==N -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
        System.out.println();
        i++;
        }
    }
}
