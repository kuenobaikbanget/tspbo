import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class KRSDAO {

    public void lihatSemuaMataKuliah() {
        String sql = "SELECT kode_mk, nama_mk, sks FROM mata_kuliah ORDER BY kode_mk";

        try (
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ) {
            System.out.println("\n=== DAFTAR MATA KULIAH ===");
            System.out.printf("%-10s %-40s %-5s%n", "Kode", "Nama Mata Kuliah", "SKS");
            System.out.println("----------------------------------------------------------");

            while (rs.next()) {
                System.out.printf(
                    "%-10s %-40s %-5d%n",
                    rs.getString("kode_mk"),
                    rs.getString("nama_mk"),
                    rs.getInt("sks")
                );
            }
        } catch (Exception e) {
            System.out.println("Gagal menampilkan mata kuliah: " + e.getMessage());
        }
    }

    public void tambahMataKuliahKeKRS(String nim, String kodeMk) {
        if (!dataAda("mahasiswa", "nim", nim)) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
            return;
        }

        if (!dataAda("mata_kuliah", "kode_mk", kodeMk)) {
            System.out.println("Mata kuliah dengan kode " + kodeMk + " tidak ditemukan.");
            return;
        }

        String sql = "INSERT INTO krs (nim, kode_mk) VALUES (?, ?)";

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, nim);
            pstmt.setString(2, kodeMk);
            pstmt.executeUpdate();
            System.out.println("Mata kuliah berhasil ditambahkan ke KRS.");
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Mata kuliah tersebut sudah ada di KRS mahasiswa.");
        } catch (Exception e) {
            System.out.println("Gagal menambahkan KRS: " + e.getMessage());
        }
    }

    public void hapusMataKuliahDariKRS(String nim, String kodeMk) {
        String sql = "DELETE FROM krs WHERE nim = ? AND kode_mk = ?";

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, nim);
            pstmt.setString(2, kodeMk);
            int affected = pstmt.executeUpdate();

            if (affected > 0) {
                System.out.println("Mata kuliah berhasil dihapus dari KRS.");
            } else {
                System.out.println("Data KRS tidak ditemukan.");
            }
        } catch (Exception e) {
            System.out.println("Gagal menghapus KRS: " + e.getMessage());
        }
    }

    public void tampilkanKRSMahasiswa(String nim) {
        String sqlMahasiswa = "SELECT nim, nama, jurusan FROM mahasiswa WHERE nim = ?";
        String sqlKrs = """
            SELECT mk.kode_mk, mk.nama_mk, mk.sks
            FROM krs k
            JOIN mata_kuliah mk ON k.kode_mk = mk.kode_mk
            WHERE k.nim = ?
            ORDER BY mk.kode_mk
            """;

        try (Connection conn = Koneksi.getConnection()) {
            try (PreparedStatement pstmtMhs = conn.prepareStatement(sqlMahasiswa)) {
                pstmtMhs.setString(1, nim);
                try (ResultSet rsMhs = pstmtMhs.executeQuery()) {
                    if (!rsMhs.next()) {
                        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                        return;
                    }

                    System.out.println("\n=== KRS MAHASISWA ===");
                    System.out.println("NIM     : " + rsMhs.getString("nim"));
                    System.out.println("Nama    : " + rsMhs.getString("nama"));
                    System.out.println("Jurusan : " + rsMhs.getString("jurusan"));
                }
            }

            try (PreparedStatement pstmtKrs = conn.prepareStatement(sqlKrs)) {
                pstmtKrs.setString(1, nim);
                try (ResultSet rsKrs = pstmtKrs.executeQuery()) {
                    System.out.printf("%-10s %-40s %-5s%n", "Kode", "Nama Mata Kuliah", "SKS");
                    System.out.println("----------------------------------------------------------");

                    boolean adaData = false;
                    while (rsKrs.next()) {
                        adaData = true;
                        System.out.printf(
                            "%-10s %-40s %-5d%n",
                            rsKrs.getString("kode_mk"),
                            rsKrs.getString("nama_mk"),
                            rsKrs.getInt("sks")
                        );
                    }

                    if (!adaData) {
                        System.out.println("Belum ada mata kuliah yang diambil.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Gagal menampilkan KRS: " + e.getMessage());
        }
    }

    public void hitungTotalSKS(String nim) {
        String sql = """
            SELECT COALESCE(SUM(mk.sks), 0) AS total_sks
            FROM krs k
            JOIN mata_kuliah mk ON k.kode_mk = mk.kode_mk
            WHERE k.nim = ?
            """;

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, nim);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Total SKS mahasiswa " + nim + " = " + rs.getInt("total_sks"));
                }
            }
        } catch (Exception e) {
            System.out.println("Gagal menghitung total SKS: " + e.getMessage());
        }
    }

    private boolean dataAda(String namaTabel, String namaKolom, String nilai) {
        String sql = "SELECT COUNT(*) AS total FROM " + namaTabel + " WHERE " + namaKolom + " = ?";

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, nilai);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next() && rs.getInt("total") > 0;
            }
        } catch (Exception e) {
            System.out.println("Gagal mengecek data: " + e.getMessage());
            return false;
        }
    }
}
