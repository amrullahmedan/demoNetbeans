package pertemuan5;
public class main {
    private String[] mhs;
    private int[] deret;
    private int hasilpenjumlahan;
    
    public void setMhs(String[] mhs) {
        this.mhs = mhs;
        mhs = null;     // Fungsi untuk menghapus isi variabel dari memory
    }
    public String[] getMhs(){
        return mhs;
    }
    
    public void setDeret(int[] deret){
        this.deret = deret;
        deret = null;  // Fungsi untuk menghapus isi variabel dari memory
    }
    public int[] getDeret(){
        return deret;
    }
    
    public void setPenjumlahan(int[] deret) {
        hasilpenjumlahan = 0;
        for (int i = 0; i < deret.length; i++){
            hasilpenjumlahan += deret[i];
        }
        deret = null; // fungsi untuk menghapus isi variabel deret dari memory
    }
    public int getPenjumlahan(){
        return hasilpenjumlahan;
    }
    
    public void tampil(String a){
        System.out.println(a);
        a = null; // menghapus isi nilai a
    }
    
    public void tampil(String a[]){
        String data ="";
        for (int i = 0; i < a.length; i++){
            if (i == 0){
                data += a[i];
            }
            else {
                data += ", "+a[i];
            }   
        }
        System.out.println(data);
        a = null; // menghapus isi nilai a
        data = null;
        }
    public void tampil(int a){
        System.out.println(a);
    }
    
    public void tampil(int a[]){
        String data ="";
        for (int i = 0; i < a.length; i++){
            if (i == 0){
                data += a[i];
            }
             else {
                data += ", "+a[i];
            }
        }
        
        System.out.println(data);
        a = null;       // menghapus isi nilai a
        data = null;
    }
    
    //menghapus semua memori untuk optimalisasi program saat dijalankan kembali
    public void hapus(){
        mhs = null;
        deret   = null;
        hasilpenjumlahan = 0;
        
    }
} 
