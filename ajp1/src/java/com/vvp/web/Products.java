package com.vvp.web;

public class Products {

    public int pid, price, stock;
    public String name;

    public Products(int pid, String name, int stock, int price){
        this.pid=pid;
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
