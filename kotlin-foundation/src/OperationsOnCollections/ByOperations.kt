package OperationsOnCollections

data class Product(
    val description: String,
    val price: Double
)

fun main() {
    val products = listOf(
        Product("bread", 2.0),
        Product("wine", 5.0)
    )
    println(products.sumByDouble { it.price })

    println(products.sortedByDescending { it.price })

    println(products.minByOrNull { it.price })
}