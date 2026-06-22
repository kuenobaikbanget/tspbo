import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class SetupKRS {

    public static void main(String[] args) {
        try (
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement()
        ) {
            String tabelMahasiswa = """
                CREATE TABLE IF NOT EXISTS mahasiswa (
                    nim VARCHAR(10) PRIMARY KEY,
                    nama VARCHAR(50),
                    jurusan VARCHAR(50)
                )
                """;

            String tabelMataKuliah = """
                CREATE TABLE IF NOT EXISTS mata_kuliah (
                    kode_mk VARCHAR(10) PRIMARY KEY,
                    nama_mk VARCHAR(100) NOT NULL,
                    sks INT NOT NULL
                )
                """;

            String tabelKrs = """
                CREATE TABLE IF NOT EXISTS krs (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    nim VARCHAR(10) NOT NULL,
                    kode_mk VARCHAR(10) NOT NULL,
                    UNIQUE (nim, kode_mk),
                    FOREIGN KEY (nim) REFERENCES mahasiswa(nim)
                        ON UPDATE CASCADE ON DELETE CASCADE,
                    FOREIGN KEY (kode_mk) REFERENCES mata_kuliah(kode_mk)
                        ON UPDATE CASCADE ON DELETE CASCADE
                )
                """;

            stmt.execute(tabelMahasiswa);
            stmt.execute(tabelMataKuliah);
            stmt.execute(tabelKrs);

            isiDataMataKuliah(conn);

            System.out.println(
                "Tabel mahasiswa, mata_kuliah, dan krs berhasil disiapkan."
            );
            System.out.println("Data contoh mata kuliah berhasil dimasukkan.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void isiDataMataKuliah(Connection conn) throws Exception {
        String sql =
            "INSERT IGNORE INTO mata_kuliah (kode_mk, nama_mk, sks) VALUES (?, ?, ?)";
        MataKuliah[] daftarMk = {
            new MataKuliah("MK01", "Pemrograman Berorientasi Objek", 3),
            new MataKuliah("MK02", "Basis Data", 3),
            new MataKuliah("MK03", "Struktur Data", 3),
            new MataKuliah("MK04", "Matematika Diskrit", 2),
            new MataKuliah("MK05", "Sistem Operasi", 3),
            new MataKuliah("MK06", "Jaringan Komputer", 3),
        };

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (MataKuliah mk : daftarMk) {
                pstmt.setString(1, mk.getKodeMk());
                pstmt.setString(2, mk.getNamaMk());
                pstmt.setInt(3, mk.getSks());
                pstmt.addBatch();
            }
            pstmt.executeBatch();
        }
    }
}
