import java.util.ArrayList;
import java.util.List;

public class SistemManajemenDarurat implements IManajemenDarurat {
    private List<Pengguna> pengguna;
    private List<Bencana> bencana;
    private List<LaporanBencana> laporanBencana;

    public SistemManajemenDarurat() {
        pengguna = new ArrayList<>();
        bencana = new ArrayList<>();
        laporanBencana = new ArrayList<>();
    }

    @Override
    public void tambahPengguna(Pengguna pengguna) {
        this.pengguna.add(pengguna);
    }

    @Override
    public void hapusPengguna(int idPengguna) {
        this.pengguna.removeIf(p -> p.getIdPengguna() == idPengguna);
    }

    @Override
    public Pengguna cariPengguna(int idPengguna) {
        return this.pengguna.stream().filter(p -> p.getIdPengguna() == idPengguna).findFirst().orElse(null);
    }

    @Override
    public void tambahBencana(Bencana bencana) {
        this.bencana.add(bencana);
    }

    @Override
    public void hapusBencana(int idBencana) {
        this.bencana.removeIf(b -> b.getIdBencana() == idBencana);
    }

    @Override
    public Bencana cariBencana(int idBencana) {
        return this.bencana.stream().filter(b -> b.getIdBencana() == idBencana).findFirst().orElse(null);
    }

    @Override
    public void tambahLaporanBencana(LaporanBencana laporan) {
        this.laporanBencana.add(laporan);
    }

    @Override
    public void hapusLaporanBencana(int idLaporan) {
        this.laporanBencana.removeIf(l -> l.getIdLaporan() == idLaporan);
    }

    @Override
    public List<LaporanBencana> cariLaporanBencana() {
        return new ArrayList<>(this.laporanBencana);
    }

    @Override
    public List<Pengguna> getPengguna() {
        return pengguna;
    }

    @Override
    public List<Bencana> getBencana() {
        return bencana;
    }
}
