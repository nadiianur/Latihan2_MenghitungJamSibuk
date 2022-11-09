//Class Dosen merupakan subclass dari class elemen
//Ditandai dengan penggunaan extends, untuk mewarisi properti dan method pada super class
//Polymorphism
public class Dosen extends Elemen{
    //properti yang hanya dapat diakses pada class dosen
    private int jumlahHariKerja;

    public Dosen(String nama, int jumlahHariKerja) {
        super(nama); //meng-construct properti pada super class
        this.jumlahHariKerja = jumlahHariKerja*8; //rumus jumlah hari kerja yang di x8
    }

    public void tampil(){
        System.out.println(getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }

    
    public int getJamSibuk(){
        return this.jumlahHariKerja; //mengambil nilai pada properti jumlahHariKerja
    }

}

    
