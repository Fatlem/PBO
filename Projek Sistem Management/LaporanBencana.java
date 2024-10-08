import java.util.Date;

public class LaporanBencana {
    private int idLaporan;
    private Pengguna penggunaPelapor;
    private String jenisBencana;
    private String deskripsi;
    private Date tanggalLaporan;
    private String statusVerifikasi;

    public LaporanBencana(int idLaporan, Pengguna penggunaPelapor, String jenisBencana, String deskripsi, Date tanggalLaporan, String statusVerifikasi) {
        this.idLaporan = idLaporan;
        this.penggunaPelapor = penggunaPelapor;
        this.jenisBencana = jenisBencana;
        this.deskripsi = deskripsi;
        this.tanggalLaporan = tanggalLaporan;
        this.statusVerifikasi = statusVerifikasi;
    }

    public int getIdLaporan() {
        return idLaporan;
    }

    public void setIdLaporan(int idLaporan) {
        this.idLaporan = idLaporan;
    }

    public Pengguna getPenggunaPelapor() {
        return penggunaPelapor;
    }

    public void setPenggunaPelapor(Pengguna penggunaPelapor) {
        this.penggunaPelapor = penggunaPelapor;
    }

    public String getJenisBencana() {
        return jenisBencana;
    }

    public void setJenisBencana(String jenisBencana) {
        this.jenisBencana = jenisBencana;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getTanggalLaporan() {
        return tanggalLaporan;
    }

    public void setTanggalLaporan(Date tanggalLaporan) {
        this.tanggalLaporan = tanggalLaporan;
    }

    public String getStatusVerifikasi() {
        return statusVerifikasi;
    }

    public void setStatusVerifikasi(String statusVerifikasi) {
        this.statusVerifikasi = statusVerifikasi;
    }
}
