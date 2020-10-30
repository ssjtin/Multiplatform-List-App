package com.example.listapp.shared

class ListClass {

    var items: MutableList<String> = mutableListOf()

    init {
        items.add("Buy a dog")
        items.add("Sell a cat")
    }

    fun add(item: String) {
        items.add(item)
    }

    fun removeItem(index: Int) {
        items.removeAt(index)
    }

}
