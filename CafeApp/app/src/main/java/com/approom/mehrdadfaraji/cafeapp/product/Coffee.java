package com.approom.mehrdadfaraji.cafeapp.product;

/**
 * Created by MehrdadFaraji on 2/2/16.
 */
public class Coffee {

    String name;
    Integer imageThumb;
    String desId;
    Integer imageProduct;


    public Coffee(String name, Integer imageThumb,
                  String desId, Integer imageProduct) {
        this.name = name;
        this.imageThumb = imageThumb;
        this.desId = desId;
        this.imageProduct = imageProduct;
    }
}
