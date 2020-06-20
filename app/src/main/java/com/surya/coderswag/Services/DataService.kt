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
        Product("Deveslopes Graphis Beanie","$20", "hat01"),
        Product("Deveslopes Graphis Hat balck","$10", "hat02"),
        Product("Deveslopes Graphis Hat White","$16", "hat03"),
        Product("Deveslopes Graphis Snapback","$7.99", "hat04")
    )
    val hoodies = listOf(
        Product("Deveslopes Hoodie Grey","$10", "hoodie01"),
        Product("Deveslopes Hoodie Red","$32.49", "hoodie02"),
        Product("Deveslopes Grey Hoodie","$19.99", "hoodie03"),
        Product("Deveslopes Graphis Black Hoodie","$14.99", "hoodie04")
    )

    val shirts = listOf(
        Product("Deveslopes Shirt Black","$29.49", "shirt01"),
        Product("Deveslopes Badge light Grey","$32.49", "shirt02"),
        Product("Deveslopes logo Shirt Red","$29.99", "shirt03"),
        Product("Deveslopes Hustle","$14.99", "shirt04"),
        Product("Kikflip Studios","$34.99", "shirt05")
    )

}