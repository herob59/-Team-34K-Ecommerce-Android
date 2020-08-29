package com.dev_app.ecommercesales.`interface`



import io.reactivex.Observable
import retrofit2.http.GET
import java.util.ArrayList


interface IRetrofit {
    @GET("json/get/EJJFgtGmY")
    fun getPhotos(): Observable<ArrayList>
}