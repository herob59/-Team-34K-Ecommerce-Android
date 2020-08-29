package com.dev_app.ecommercesales.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev_app.ecommercesales.R
import com.dev_app.ecommercesales.models.Model
import com.squareup.picasso.Picasso


class ShoesAdapter(val items: ArrayList, val context: Context) : RecyclerView.Adapter() {

 override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ShoesAdapter.ViewHolder {
  val view: View = LayoutInflater.from(context).inflate(R.layout.shoes_product, parent, false)
  return ShoesAdapter.ViewHolder(view)
 }

 override fun getItemCount(): Int {
  return items.size
 }

 override fun onBindViewHolder(holder: ShoesAdapter.ViewHolder?, position: Int) {
  holder!!.bindingvalues(items.get(position))
 }

 class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  fun bindingvalues(get: Model.Photo) {
   Picasso.get().load(get.thumbnailUrl).into(itemView.)
   itemView.tvTitle.text = get.title
  }
 }

}