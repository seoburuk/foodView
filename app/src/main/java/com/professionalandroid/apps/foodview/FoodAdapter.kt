package com.professionalandroid.apps.foodview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.professionalandroid.apps.foodview.FoodItem
import kotlinx.android.synthetic.main.item_food.view.*

class FoodAdapter(private val foodList: List<FoodItem>) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentFood = foodList[position]
        holder.bind(currentFood)
    }

    override fun getItemCount() = foodList.size

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(foodItem: FoodItem) {
            itemView.iv_food_image.setImageResource(foodItem.imageRes)
            itemView.tv_food_name.text = foodItem.name
            itemView.tv_food_description.text = foodItem.description
        }
    }
}
