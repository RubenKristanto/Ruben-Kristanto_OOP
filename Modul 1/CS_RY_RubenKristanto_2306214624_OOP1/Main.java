public class Main
{
 public static void main(String[] args){   
       Guru guruIPA = new Guru("Mr. Budi", 20);
       MataPelajaran IPA = new MataPelajaran("IPA", guruIPA);
       Siswa siswa1 = new Siswa("Budi",5 ,IPA);
       
       IPA.addNilai(Penilaian.UTS, 30, Penilaian.UAS, 70);
       siswa1.totalNilai();
       IPA.showDetail();
       siswa1.showDetail();
    }
}
