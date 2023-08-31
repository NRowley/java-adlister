import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> allAds = new ArrayList<>();
        ResultSet rs = this.connection.createStatement().executeQuery("SELECT * FROM ads");
        while (rs.next()) {
            allAds.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
        }
        return allAds;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String insertAdStatement = "INSERT INTO ads (title, description) values (" + ad.getTitle() + ", " + ad.getDescription() + ")";
        Statement stmt = this.connection.createStatement();
        stmt.executeUpdate(insertAdStatement, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        return rs.getLong(1);
    }
}