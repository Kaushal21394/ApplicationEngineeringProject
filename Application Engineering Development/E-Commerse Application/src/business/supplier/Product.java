/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package business.supplier;

/**
 *
 * @author chava
 */
public class Product {
    private static int pid = 0;
    private String prodName;
    private String productId;
    private int price;
    private int availQuantity;

    public Product() {
        pid++;
        productId = "PRD"+pid;
    }

    public int getAvailQuantity() {
        return availQuantity;
    }

    public void setAvailQuantity(int availQuantity) {
        this.availQuantity = availQuantity;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }
    
    @Override
    public String toString() {
        return prodName;
    }
    
}
