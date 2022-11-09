//Class Elemen merupakan Super Class dari class mahasiswa dan dosen
public class Elemen{
    //properties pada super class yang nantinya di turunkan pada subclass
    private String nama; 

    public Elemen(String nama) {
        this.nama= nama;
    }

    public String getNama (){
        return nama;
    }

}