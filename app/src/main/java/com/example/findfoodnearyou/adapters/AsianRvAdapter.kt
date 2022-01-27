package com.example.findfoodnearyou.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.findfoodnearyou.databinding.AsianFoodItemBinding
import com.example.findfoodnearyou.models.Food

class AsianRvAdapter(val asianFoodList:ArrayList<Food>,val listener:OnItemClickListener):RecyclerView.Adapter<AsianRvAdapter.MyViewHolder>() {

    inner class MyViewHolder(private val asianFoodItemBinding: AsianFoodItemBinding):RecyclerView.ViewHolder(asianFoodItemBinding.root){

        @SuppressLint("SetTextI18n")
        fun onBind(food: Food){
            asianFoodItemBinding.apply {
                asiaFoodImg.setImageResource(food.image)
                restaurantName.text = food.restaurant
                asianFootNameTv.text = food.name
                starValueTv.text = food.rating
                asianFoodPriceTv.text ="$${food.price}"
                if(food.free_ship){
                    freeShipImg.visibility = View.VISIBLE
                    freeShipTv.visibility = View.VISIBLE
                }
                itemView.setOnClickListener {
                    listener.onItemClick(food)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(AsianFoodItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        return holder.onBind(asianFoodList[position])
    }

    override fun getItemCount(): Int {
        return asianFoodList.size
    }

    interface OnItemClickListener{
        fun onItemClick(food: Food)
    }
}