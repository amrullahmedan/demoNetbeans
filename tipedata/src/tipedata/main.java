package tipedata;
public class main {
    public static void main(String[] args) {
        System.out.println("10 + 10 out put ini merupakan teks");
        System.out.println(10 + 10 +" out put ini adalah nilai integer");
        
/*
        text        =>  String, char    =>  teks atau karakter
        integer     =>  int             =>  bilangan bulat
        floating    =>  float           =>  bilangan berkoma
        double      =>  double          =>  bilangan berkoma
        Boolean     =>  bool            =>  true/false (benar/salah)
*/
        String Nama = "Amrullah";
        String Alamat = "Universitas Muhammadiyah Sumatera Utara";
        System.out.println(Nama+" ini adalah tipe data string");
        System.out.println(Alamat+" ini adalah tipe data string");
        
        int a = 5, b = 7, c;
        c = a + b;
        System.out.print(a+ " + "+b+ " = ");
        System.out.println(c+"  ini adalah tipe data Integer ");
        
        double nilai1 = 3.7, nilai2 = 3.14, nilai3 ;
        nilai3 = nilai1 % nilai2;
        System.out.print(nilai1+" % "+nilai2+" = ");
        System.out.println(nilai3+" ini adalah tipe data double");
        
        
        
    }
    
}
