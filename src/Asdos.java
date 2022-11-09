//class asdos merupakan subclass dari class mahasiswa
//Ditandai dengan penggunaan extends , untuk mewarisi properti dan method dari class mahasiswa
public class Asdos extends Mahasiswa {
    private int jamNgasdos; //properti pada class asdos

    public Asdos(String nama, int sks, int jamNgasdos) {
        super(nama,sks); //meng-construct properti pada class mahasiswa
        this.jamNgasdos = getSks() + jamNgasdos; //rumus untuk jam ngasdos + dengan sks
    }

    public void tampil(){
        System.out.println(getNama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk());
    }

    public int getJamSibuk(){
        return this.jamNgasdos; //mengambil nilai pada properti jamNgasdos
    }

}
