package com.sanjeet.adidas.model

import com.sanjeet.adidas.R

object DataDummy {
    val product = Product(
        1,
        "Superstar Vegan 90",
        240.00,
        100,
        R.drawable.superstar_shose1,
        "Trending Now"

    )

    val productList = listOf(
        product,
        product.copy(
            2,
            "Superstar Vegan 95",
            240.00,
            100,
            R.drawable.superstar_shose2,
            "Trending Now"
        ),
        product.copy(
            3,
            "Superstar Vegan 70",
            220.00,
            100,
            R.drawable.superstar_shose3,
            "Trending Now"
        )

    )
}