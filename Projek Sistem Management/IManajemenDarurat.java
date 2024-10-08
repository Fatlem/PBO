import java.util.List;

public interface IManajemenDarurat {
    void tambahPengguna(Pengguna pengguna);
    void hapusPengguna(int idPengguna);
    Pengguna cariPengguna(int idPengguna);
    void tambahBencana(Bencana bencana);
    void hapusBencana(int idBencana);
    Bencana cariBencana(int idBencana);
    void tambahLaporanBencana(LaporanBencana laporan);
    void hapusLaporanBencana(int idLaporan);
    List<LaporanBencana> cariLaporanBencana();
    List<Pengguna> getPengguna(); 
    List<Bencana> getBencana(); 
}
