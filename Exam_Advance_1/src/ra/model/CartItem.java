package ra.model;

import java.util.Scanner;

public class CartItem {
    private int cartItemId;
    private Product product;
    private int quantity;

    public CartItem() {
    }

    public CartItem(int cartItemId, Product product, int quantity) {
        this.cartItemId = cartItemId;
        this.product = product;
        this.quantity = quantity;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng muốn thêm vào giỏ hàng: ");
        quantity = Integer.parseInt(sc.nextLine());
    }
    public void displayData(){
        System.out.printf("%-10d %-15s %-10d \n",cartItemId,product.getProductName(),quantity);
    }
}