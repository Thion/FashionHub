package com.example.formosafashionhub.classes

class Others{
    var id: String = ""
    var name: String = ""
    var price: String = ""
    var description: String = ""
    var imageUrls: List<String> = listOf("")

    constructor(
        id: String,
        name: String,
        price: String,
        description: String,
        imageUrls: List<String>
    ){
        this.id = id
        this.name = name
        this.price = price
        this.description = description
        this.imageUrls = imageUrls

    }
    constructor()
}


