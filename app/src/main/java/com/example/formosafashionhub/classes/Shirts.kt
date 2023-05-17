package com.example.formosafashionhub.classes

class Shirts{
    var id: String = ""
    var name: String = ""
    var price: String = ""
    var description: String = ""
    var imageUrls: String = ""

    constructor(
        id: String,
        name: String,
        price: String,
        description: String,
        imageUrls: String
    ){
        this.id = id
        this.name = name
        this.price = price
        this.description = description
        this.imageUrls = imageUrls

    }
    constructor()
}




