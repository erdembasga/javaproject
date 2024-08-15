package homeworks;

import java.time.LocalDate;

public class Market {

    private String productName;
    private double productPrice;
    private String expirationDate;

    //Three-Parameter Constructor
    public Market(String productName, double productPrice, int monthsFromNow){

        this.productName = productName;
        //If the price is greater than 99, apply a 10% discount.
        if (productPrice>99){
            this.productPrice = productPrice * 0.9;
        } else{
            this.productPrice = productPrice;
        }

        expirationDate = LocalDate.now().plusMonths(monthsFromNow).toString();

    }

    //Two-Parameter Constructor
    public Market(String productName, double productPrice) {

        this.productName = productName;

        //If the price is greater than 99, apply a 10% discount.
        if (productPrice>99){
            this.productPrice = productPrice * 0.9;
        } else{
            this.productPrice = productPrice;
        }

        expirationDate = "This product has no expiration date";



    }

    @Override
    public String toString() {
        return "Market{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
