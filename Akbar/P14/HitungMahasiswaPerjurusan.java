import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HitungMahasiswaPerjurusan {

    public static void main(String[] args) {
        String sql =
            "SELECT jurusan, COUNT(*) AS total FROM mahasiswa GROUP BY jurusan";
        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()
        ) {
            while (rs.next()) {
                System.out.println(
                    rs.getString("jurusan") + " = " + rs.getInt("total")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
