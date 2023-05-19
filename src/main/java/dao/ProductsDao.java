package dao;

import models.Product;
import java.util.List;

//----------------------------------------------   PART OF DAO FACTORY   ----------------------------------------------------------------

public interface ProductsDao {

// READ ALL PRODUCTS ----------------------------------------------------------------
    List<Product> all();


//    INSERT NEW PRODUCTS --------------------------------
    void insert(Product product);


//    DELETE PRODUCTS --------------------------------
    void delete(long productId);


//    UPDATE PRODUCTS --------------------------------
//    void update(Product product);


//    SEARCH PRODUCTS BY NAME --------------------------------


//    SORT PRODUCTS BY PRICE --------------------------------

}
