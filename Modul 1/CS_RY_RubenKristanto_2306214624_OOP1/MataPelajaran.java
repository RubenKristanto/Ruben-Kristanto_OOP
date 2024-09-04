

public class MataPelajaran implements Showing
{
    public String namaMataPelajaran;
    public Guru guru;
    public Penilaian UTS;
    public Penilaian UAS;
    public float nilaiUTS;
    public float nilaiUAS;
    
    public MataPelajaran(String newNamaMataPelajaran, Guru newGuru){
        this.namaMataPelajaran = newNamaMataPelajaran;
        this.guru = newGuru;
    }
    
    public void addNilai(Penilaian UTS, float newNilaiUTS, Penilaian UAS, float newNilaiUAS){
        this.nilaiUTS = newNilaiUTS;
        this.nilaiUAS = newNilaiUAS;
        this.UTS = UTS;
        this.UAS = UAS;
    }
    
    public void showDetail(){
        System.out.println("Mata Pelajaran: "+namaMataPelajaran+"\nNama Guru: "+guru.name+"\nNilai UTS: "+nilaiUTS+"\nNilai UAS: "+nilaiUAS);
    }
}
