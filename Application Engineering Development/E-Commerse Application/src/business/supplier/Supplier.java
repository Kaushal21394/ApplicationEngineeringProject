/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package business.supplier;

import utility.Validator;

/**
 *
 * @author chava
 */
public class Supplier {
    
    private String supplierId;
    private String supplyName;
    private String username;
    private String password;
    private ProductCatalog productCatalog;
    private static int sid = 0;
    
    public Supplier() {
        sid++;
        supplierId = "SUP"+sid;
        productCatalog = new ProductCatalog();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Validator.generateHash(password);
    }
   

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    
    @Override
    public String toString() {
        return supplyName;
    }
    
}
