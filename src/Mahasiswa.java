//Class mahasiswa merupakan subclass dari class elemen
//Ditandai dengan penggunaan extends , untuk mewarisi properti dan method pada super class
//Polymorphism 
public class Mahasiswa extends Elemen {
    private int sks; //properti pada class mahasiswa

    public Mahasiswa(String nama,int sks) {
        super(nama); //meng-construct properti pada super class
        this.sks = sks*3; //rumus untuk sks x3
    }

    public void tampil(){
        System.out.println(getNama() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }

    //method yang digunakan untuk mengambil nilai pada properti sks
    //method ini nantinya digunakan pada class asdos
    //fungsinya untuk mendapatkan nilai sks mahasiswa
    public int getSks(){
        return this.sks; //nilai pada properti sks 
    }

    public int getJamSibuk(){
        return this.sks; //mengambil nilai pada properti sks
    }

}
