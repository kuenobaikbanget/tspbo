import java.sql.Connection;
import java.sql.Statement;

public class SetupDatabase {

    public static void main(String[] args) {
        try (
            Connection conn = Koneksi.getConnection();
            Statement stmt = conn.createStatement()
        ) {
            String sql = """
                CREATE TABLE IF NOT EXISTS mahasiswa (
                    nim VARCHAR(10) PRIMARY KEY,
                    nama VARCHAR(50),
                    jurusan VARCHAR(50)
                )
                """;
            stmt.execute(sql);
            System.out.println("Tabel mahasiswa berhasil dibuat!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
