
public class Siswa implements Showing
{
    public String nama;
    public int id;
    public String status;
    public float totalNilai;
    public MataPelajaran mataPelajaran;
    
    public Siswa(String newNama, int newID, MataPelajaran newMataPelajaran){
        this.nama = newNama;
        this.id = newID;
        this.mataPelajaran = newMataPelajaran;
    }
    
    public void totalNilai(){
    totalNilai = (40*this.mataPelajaran.nilaiUTS)/100 + (60*this.mataPelajaran.nilaiUAS)/100;
    if(totalNilai>=75){
        status = "LULUS";
    }
    else{
        status = "TIDAK LULUS";
    }
    }
    
    public void showDetail(){
        System.out.println("Nama Siswa: "+nama+"\nID: "+id+"\nMata Pelajaran: "+mataPelajaran.namaMataPelajaran+"\nTotal Nilai: "+totalNilai+"\nStatus: "+status);
    }
}
