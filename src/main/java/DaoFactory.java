public class DaoFactory {
    private static Ads adsDao;

    private static Parks parksDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Parks getParksDao() {
        if(parksDao == null) {
            // instantiating the class will create our connection to the DB
            // and allow us to use the methods in the MySQLParksDao
            parksDao = new MySQLParksDao();
        }
        return parksDao;
    }
}
