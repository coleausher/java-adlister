package dao;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ListProducts implements ProductsDao{
    private List<Product> products = new ArrayList<Product>();

    // When an instance of this class is created, we'll populate the
    // products array list with data, "faking" the records
    public ListProducts(){
        insert(new Product(1, "hammer", 9.99));
        insert(new Product(2, "screwdriver", 9.99));
        insert(new Product(3, "drill", 29.99));
    }

    @Override
    public List<Product> all() {
        return this.products;
    }


    // Persist a new record. We'll simulate this by adding the passed object
    // to our internal array list of products.
    @Override
    public void insert(Product product) {
        product.setId(this.products.size() + 2);
            this.products.add(product);

    }

    @Override
    public void delete(long productId) {
        this.products.remove(((int) productId) - 1);
    }

}
