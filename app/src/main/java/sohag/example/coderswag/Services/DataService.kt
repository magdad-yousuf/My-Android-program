package sohag.example.coderswag.Services

import sohag.example.coderswag.Model.Category
import sohag.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(

        Product("Devslopes Graphic Beanie", "$20", "hat01"),
        Product("Devslopes Hat Black ", "$22", "hat02"),
        Product("Devslopes Hat White", "$20", "hat03"),
        Product("Devslopes Hat SnapBack", "$25", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28", "hoodie01"),
        Product("Devslopes Hoodie Black","$32", "hoodie02"),
        Product("Devslopes Hoodie Rad","$28", "hoodie03"),
        Product("Devslopes Hoodie White","$32", "hoodie04")
    )

    val shirts = listOf(

        Product("Devslopes Shirt Gray","$18", "hoodie01"),
        Product("Devslopes Badge Light Gray","$20", "hoodie02"),
        Product("Devslopes Logo Shirt Rad","$22", "hoodie03"),
        Product("Devslopes Hustle","$22", "hoodie04"),
        Product("Kickflip Studios","$18", "hoodie05")
    )

}