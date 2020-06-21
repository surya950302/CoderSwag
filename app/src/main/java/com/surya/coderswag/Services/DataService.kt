package com.surya.coderswag.Services

import com.surya.coderswag.Model.Category
import com.surya.coderswag.Model.Product

object DataService{
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Deveslopes Graphis Beanie","$20", "hat1"),
        Product("Deveslopes Graphis Hat balck","$10", "hat2"),
        Product("Deveslopes Graphis Hat White","$16", "hat3"),
        Product("Deveslopes Graphis Snapback","$7.99", "hat4")
    )
    val hoodies = listOf(
        Product("Deveslopes Hoodie Grey","$10", "hoodie1"),
        Product("Deveslopes Hoodie Red","$32.49", "hoodie2"),
        Product("Deveslopes Grey Hoodie","$19.99", "hoodie3"),
        Product("Deveslopes Graphis Black Hoodie","$14.99", "hoodie4")
    )

    val shirts = listOf(
        Product("Deveslopes Shirt Black","$29.49", "shirt1"),
        Product("Deveslopes Badge light Grey","$32.49", "shirt2"),
        Product("Deveslopes logo Shirt Red","$29.99", "shirt3"),
        Product("Deveslopes Hustle","$14.99", "shirt4"),
        Product("Kikflip Studios","$34.99", "shirt5")
    )

    val digitalGoods = listOf<Product>( )

    fun getProducts(category : String) : List<Product>{
        var list = listOf<Product>()
        if(category == "HATS"){
            list = hats
        }
        else if(category == "SHIRTS"){
            list = shirts
        }
        else if(category == "HOODIES"){
            list = hoodies
        }
        else{
            list = digitalGoods
        }
        return list
    }

}