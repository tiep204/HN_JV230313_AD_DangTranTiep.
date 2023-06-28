package ra.model;

import java.util.Scanner;

public class Catalog {
    private int catalogId;
    private String catalogName;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên danh mục ");
        catalogName = sc.nextLine();
    }
    public void displayData(){
        System.out.println("id "+catalogId+ " Name "+ catalogName);
    }
}