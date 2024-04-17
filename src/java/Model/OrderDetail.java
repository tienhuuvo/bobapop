/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author duong
 */
public class OrderDetail {

    String order_detail_id;
    int quantity;
    String size;
    float price;
    
    int ice;
    int sugar;
    String product_id;
    String order_id;

    public OrderDetail() {
    }

    public OrderDetail(String order_detail_id, int quantity, String size,float price,  int ice, int sugar, String product_id, String order_id) {
        this.order_detail_id = order_detail_id;
        this.quantity = quantity;
        this.size = size;
        this.price = price;       
        this.ice = ice;
        this.sugar = sugar;
        this.product_id = product_id;
        this.order_id = order_id;
    }

    public int getIce() {
        return ice;
    }

    public void setIce(int ice) {
        this.ice = ice;
    }

    public String getOrderDetailId() {
        return order_detail_id;
    }

    public void setOrderDetailId(String order_detail_id) {
        this.order_detail_id = order_detail_id;
    }

    public String getProductId() {
        return product_id;
    }

    public void setProductId(String product_id) {
        this.product_id = product_id;
    }

    public String getOrderId() {
        return order_id;
    }

    public void setOrderId(String order_id) {
        this.order_id = order_id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
