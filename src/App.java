//menampilkan output 
public class App {
    public static void main(String[] args) throws Exception {
        Dosen Dsatu = new Dosen("Raja OP Damanik", 5);
        Dosen Ddua = new Dosen("Nivotko", 3);
        Mahasiswa MhSatu = new Mahasiswa("Firman", 20);
        Mahasiswa MhDua = new Mahasiswa("Nid to pass this sem", 23);
        Mahasiswa MhTiga = new Asdos("Fairuzikun", 24, 1); //Upcasting
        Mahasiswa MhEmpat =  new Asdos("Angel-chan", 21, 1); //Upcasting

        MhTiga.tampil();
        Dsatu.tampil();
        MhEmpat.tampil();
        MhSatu.tampil();
        MhDua.tampil();
        Ddua.tampil();

        //menghitung total jam sibuk fasilkom
        int total ;
        total = Dsatu.getJamSibuk() + Ddua.getJamSibuk() + MhSatu.getJamSibuk() + MhDua.getJamSibuk() + MhTiga.getJamSibuk() + MhEmpat.getJamSibuk();
        
        System.out.println("Total jam sibuk elemen fasilkom adalah " + total);
        

    }
}
