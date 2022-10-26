package lingkaran;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
     /*
        RUMUS LINGKARAN
        luas lingkaran     = phi x r x r
        keliling lingkaran = phi x diameter
        diameter = 2 x r
     */
         final double  phi= 3.14;
         double keliling, Luas, r, d;
         Scanner dt_rumus = new Scanner(System.in);
         System.out.print("Masukkan nilai jari-jari : ");
         r = dt_rumus.nextDouble();
//         System.out.println("Masukkan nilai diameter : ");
//         d = dt_rumus.nextDouble();

         Luas = phi * ( r * r );
         System.out.println("Luas lingkaran adalah : " +Luas);
         
         keliling = phi * (2 * r);
         System.out.println("Keliling lingkaran adalah "+keliling);
 
    }
    
}
