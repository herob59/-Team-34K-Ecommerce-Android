package com.dev_app.ecommercesales.`interface`

import com.dev_app.ecommercesales.models.Product
import retrofit2.http.GET

interface EcommerceApi {

    @GET("api/ecommerce/v1/allProducts")
    suspend fun fetchAllProducts(): List<Product>
}
