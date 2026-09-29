import java.util.Scanner;

public class PersamaanKuadratCFG {

    public static void main(String[] args) {
        // Node 1: Start
        Scanner input = new Scanner(System.in);
        String result = "";

        // Node 2: Input A, B, C & Hitung D
        System.out.print("Masukkan nilai A: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai B: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai C: ");
        double c = input.nextDouble();

        double d = (b * b) - (4 * a * c);

        // Node 3: D > 0?
        if (d > 0) {
            // Node 4 (Yes)
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            result = "Dua akar real: x1 = " + x1 + ", x2 = " + x2;
        } 
        // Node 5 (No): D == 0?
        else if (d == 0) {
            // Node 6 (Yes)
            double x = -b / (2 * a);
            result = "Satu akar kembar: x = " + x;
        } 
        else {
            // Node 7 (No untuk D==0, otomatis D < 0)
            result = "Akar imajiner (tidak ada akar real)";
        }

        // Node 8: Print Result
        System.out.println("Hasil: " + result);

        // Node 9: Stop
        input.close();
    }
}