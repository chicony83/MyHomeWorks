package com.example.myhomeworks.dto

data class Coffee(
    val name: String,
    val photoURL: String
)

object coffeerSet {

    fun catalogCoffee() = mutableListOf<Coffee>(
//        Coffee(
//            "Arabica",
//            "https://dom-eda.com/uploads/images/catalog/item/a65a48f6c4/2285f7c353_500.jpg"
//        ),
        Coffee(
            "Robusta",
            "https://slon-tea.ru/wa-data/public/shop/products/45/18/1845/images/8180/8180.970.jpg"
        )
    )

    fun addInCoffeeCatalog(
        name: String,
        url: String
    ) {

        catalogCoffee().add(Coffee(name = name,photoURL = url))
    }
}