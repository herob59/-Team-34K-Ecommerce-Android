package com.dev_app.ecommercesales.`interface`

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiCLient {
companion object{
    fun create(): IRetrofit{
        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://next.json-generator.com/api/json/get/EJJFgtGmY")
            .build()
        return retrofit.create(IRetrofit::class.java!!)
    }
}
}