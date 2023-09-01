package dao;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import controllers.Config;
import models.Ad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;
    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
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
//        String insertAdStatement = "INSERT INTO ads (title, description) values (" + ad.getTitle() + ", " + ad.getDescription() + ")";

        String insertAdStatement = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s');", ad.getUserId(), ad.getTitle(), ad.getDescription());
        System.out.println(insertAdStatement);
//
        Statement stmt = this.connection.createStatement();

        stmt.executeUpdate(insertAdStatement, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
        }
        return rs.getLong(1);
    }
}