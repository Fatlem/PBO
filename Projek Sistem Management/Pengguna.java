public class Pengguna {
    private int idPengguna;
    private String nama;

    public Pengguna(int idPengguna, String nama) {
        this.idPengguna = idPengguna;
        this.nama = nama;
    }

    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
