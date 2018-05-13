/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package business.supplier;

import java.util.ArrayList;

/**
 *
 * @author chava
 */
public class ProductCatalog {
    
    private ArrayList<Product> productCatalog;
    
    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    //Adding a new Product to Catalog
    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    //Removing a Product from catalog
    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }
    
    //Searching for the  Product in the Catalog
    public Product searchProduct(String id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Product p : productCatalog) {
            if(p.getProductId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
