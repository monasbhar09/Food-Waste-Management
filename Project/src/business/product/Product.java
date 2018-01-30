/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.product;

/**
 *
 * @author Dhanashree Chavan
 */
public class Product {

    private String productName;
    private int productId;
    private static int count = 1;

    public Product() {
        this.productId = count;
        count++;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return this.productName;
    }

}
