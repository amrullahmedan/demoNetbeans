package operator_assigment;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        /*
            =   samadengan
            +=  
            -=  
            /=  
            *=  
            %=  

        */
        float nilai1, nilai2, nilai3;
        Scanner dt_masuk= new Scanner(System.in);
        System.out.print("Masukkan Nilai 1 : ");
        nilai1 = dt_masuk.nextFloat();
        System.out.print("Masukkan Nilai 2 : ");
        nilai2 = dt_masuk.nextFloat();
        System.out.print("Masukkan Nilai 3 : ");
        nilai3 = dt_masuk.nextFloat();
        
        nilai1 += nilai2;
        System.out.println("Ini adalah fungsi += "+nilai1);
        
        nilai3 -= nilai1;
        System.out.println("Ini adalah fungsi -= "+nilai3);
        
        nilai1 /= nilai3;
        System.out.println("Ini adalah fungsi /= "+nilai1);
        
        nilai2 *= nilai1;
        System.out.println("Ini adalah fungsi *= "+nilai2);
        
        nilai3 %= nilai1;
        System.out.println("Ini adalah fungsi %= "+nilai3);
        
        
        
        
    }
    
}
