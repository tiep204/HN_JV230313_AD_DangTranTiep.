package ra.model;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private double productPrice;
    private String decription;
    private int stock;
    private Catalog catalog;
    private boolean status;

    public Product() {
    }

    public Product(String productId, String productName, double productPrice, String decription, int stock, Catalog catalog, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.decription = decription;
        this.stock = stock;
        this.catalog = catalog;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id");
        productId = sc.nextLine();
        System.out.println("nhap ten");
        productName = sc.nextLine();
        System.out.println("nhap gia");
        productPrice = Double.parseDouble(sc.nextLine());
        System.out.println("nhap mota");
        decription = sc.nextLine();
        System.out.println("nhap stock");
        stock = Integer.parseInt(sc.nextLine());
        System.out.println("nhap trang thai");
        status = Boolean.parseBoolean(sc.nextLine());
    }
    public void displayData(){
        System.out.println("Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", decription='" + decription + '\'' +
                ", stock=" + stock +
                ", catalog=" + catalog.getCatalogId() +
                ", status=" + (status ? "bán" : "không bán") +
                '}');
    }
}