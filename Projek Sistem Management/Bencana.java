public class Bencana {
    private int idBencana;
    private String jenisBencana;
    private String lokasi;
    private String tingkatKeparahan;
    private String tanggalKejadian;
    private String status;

    public Bencana(int idBencana, String jenisBencana, String lokasi, String tingkatKeparahan, String tanggalKejadian, String status) {
        this.idBencana = idBencana;
        this.jenisBencana = jenisBencana;
        this.lokasi = lokasi;
        this.tingkatKeparahan = tingkatKeparahan;
        this.tanggalKejadian = tanggalKejadian;
        this.status = status;
    }

    public int getIdBencana() {
        return idBencana;
    }

    public void setIdBencana(int idBencana) {
        this.idBencana = idBencana;
    }

    public String getJenisBencana() {
        return jenisBencana;
    }

    public void setJenisBencana(String jenisBencana) {
        this.jenisBencana = jenisBencana;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTingkatKeparahan() {
        return tingkatKeparahan;
    }

    public void setTingkatKeparahan(String tingkatKeparahan) {
        this.tingkatKeparahan = tingkatKeparahan;
    }

    public String getTanggalKejadian() {
        return tanggalKejadian;
    }

    public void setTanggalKejadian(String tanggalKejadian) {
        this.tanggalKejadian = tanggalKejadian;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
