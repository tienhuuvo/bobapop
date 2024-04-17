/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Model;

import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author duong
 */
public class Order {

    String order_id;
    java.sql.Timestamp order_date;
    float total_price;
    String address;
    String status;
    String email;
    String fullName;
    String phone;
    String shipment;
    String message;

    public Order() {
    }

    public Order(String order_id, Date order_date, float total_price, String status , String address, String email, String fullName, String phone, String shipment, String message) {
        this.order_id = order_id;
        this.order_date = new java.sql.Timestamp(order_date.getTime());
        this.total_price = total_price;
        this.address = address;
        this.status = status;
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
        this.shipment = shipment;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOrderId() {
        return order_id;
    }

    public void setOrderId(String order_id) {
        this.order_id = order_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShipment() {
        return shipment;
    }

    public void setShipment(String shipment) {
        this.shipment = shipment;
    }

    public java.sql.Timestamp getOrderDate() {
        return order_date;
    }

    public void setOrderDate(java.sql.Timestamp order_date) {
        this.order_date = order_date;
    }

    public float getTotalPrice() {
        return total_price;
    }

    public void setTotalPrice(float total_price) {
        this.total_price = total_price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(this.order_date);
        return formattedDate;
    }

    public String getTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedDate = dateFormat.format(this.order_date);
        return formattedDate;
    }
}
