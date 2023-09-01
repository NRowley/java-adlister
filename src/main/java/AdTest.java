import java.sql.SQLException;
import java.util.List;

public class AdTest {
    public static void main(String[] args) throws SQLException {
        MySQLAdsDao adsDao = new MySQLAdsDao(new Config());
        Ad newAd = new Ad(1, "Thing5", "Thingy thing");
        adsDao.insert(newAd);

        List<Ad> allAds = adsDao.all();
        for(int i = 0; i < allAds.size(); i++){
            System.out.printf("Title: %s%nID: %d%n", allAds.get(i).getTitle(), allAds.get(i).getId());
        }



    }
}
