package com.dev_app.ecommercesales

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.dev_app.ecommercesales.adapter.ShoesAdapter
import com.dev_app.ecommercesales.databinding.FragmentShoesBinding
import com.dev_app.ecommercesales.models.Model
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_shoes.*
import kotlinx.android.synthetic.main.shoes_product.*


class shoesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val binding: FragmentShoesBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoes, container,false

        )

        retainInstance = true


        R.id.shoe_name
        R.id.profile_image
        R.id.shoe_price


        val mAPIClient by lazy {
            APIClient.create();
        }

        //.....

        mAPIClient.getPhotos()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ it ->
                Log.d("size", it.size.toString())
                setDataInRecyclerView(it);
            }, { it ->
                Log.d("error", "errors")
            })

        recyclerview_shoes.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
        }


        return binding.root
    }

    private fun setDataInRecyclerView(it:ArrayList<Model.Photo>?) {
        recyclerview_shoes.adapter = ShoesAdapter(it!!,this)
    }

}
