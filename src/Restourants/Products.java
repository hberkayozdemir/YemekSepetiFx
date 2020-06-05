package Restourants;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public  class Products {

    private SimpleStringProperty productName;
    private SimpleIntegerProperty productQuantity;
    private SimpleDoubleProperty productPrice;


    public Products(String name, int quantity, double price) {
        this.productName =new SimpleStringProperty(name);
        this.productQuantity = new SimpleIntegerProperty(quantity);
        this.productPrice =new SimpleDoubleProperty( price);
    }

    public String getProductName() {
        return productName.get();
    }

    public SimpleStringProperty productNameProperty() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName =new SimpleStringProperty(productName);
    }

    public int getProductQuantity() {
        return productQuantity.get();
    }

    public SimpleIntegerProperty productQuantityProperty() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity =new SimpleIntegerProperty(productQuantity);
    }

    public double getProductPrice() {
        return productPrice.get();
    }

    public SimpleDoubleProperty productPriceProperty() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice =new SimpleDoubleProperty(productPrice);
    }
}
