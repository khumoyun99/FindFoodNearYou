package com.example.findfoodnearyou.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.findfoodnearyou.databinding.PopularItemBinding
import com.example.findfoodnearyou.models.Food

class PopularRvAdapter(
    val popularList:ArrayList<Food>,
    val listener: AsianRvAdapter.OnItemClickListener
):RecyclerView.Adapter<PopularRvAdapter.MyViewHolder>() {

    inner class MyViewHolder(val popularItemBinding: PopularItemBinding):RecyclerView.ViewHolder(popularItemBinding.root){

        @SuppressLint("SetTextI18n")
        fun onBind(food: Food){
            popularItemBinding.apply {
                foodNameTv.text = food.name
                priseTv.text = "$"+food.price
                foodImg.setImageResource(food.image)
                if (food.free_ship){
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
        return MyViewHolder(PopularItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(popularList[position])
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    interface OnItemClickListener{
        fun onItemClick(food: Food)
    }
}