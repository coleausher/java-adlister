package dao;

public class DaoFactory {

private static ProductsDao productsDao;
//private static UsersDao usersDao;

     public static ProductsDao getProductsDao(){
         if(productsDao == null){
             productsDao = new ListProducts();
         }
         return productsDao;
    }

//    If I had another users table, then I would need another DAO object
//    public static UsersDao getUsersDao(){
//         if(usersDao == null){
//             usersDao = new ListUsers();
//         }
//         return usersDao;
//    }

    //DaoFactory.getProductsDao() will run our ListProducts Constructor
    // which initially populates our List of products
}
