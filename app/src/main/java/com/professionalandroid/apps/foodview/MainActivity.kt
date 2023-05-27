package com.professionalandroid.apps.foodview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.professionalandroid.apps.foodview.FoodAdapter
import com.professionalandroid.apps.foodview.FoodItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodListKorean = listOf(
            FoodItem(R.raw.루피1, "Bibimbap", "Traditional Korean mixed rice dish"),
            FoodItem(R.raw.루피2, "Kimchi", "Spicy fermented cabbage"),
            FoodItem(R.raw.루피3, "Japchae", "Stir-fried glass noodles with vegetables"),
            // Add more Korean food items as needed
        )

        val foodListWestern = listOf(
            FoodItem(R.raw.라면1, "Pizza", "Italian dish with a savory bread crust topped with cheese and various toppings"),
            FoodItem(R.raw.라면2, "Burger", "Sandwich consisting of a cooked patty of ground meat"),
            FoodItem(R.raw.라면3, "Pasta", "Italian dish made from an unleavened dough of durum wheat flour"),
            // Add more Western food items as needed
        )

        val foodListJapanese = listOf(
            FoodItem(R.raw.브리또1, "Sushi", "Japanese dish consisting of vinegared rice and various ingredients"),
            FoodItem(R.raw.브리또2, "Ramen", "Japanese noodle soup dish"),
            FoodItem(R.raw.브리또3, "Tempura", "Japanese dish of battered and deep-fried seafood or vegetables"),
            // Add more Japanese food items as needed
        )

        val foodListChinese = listOf(
            FoodItem(R.raw.짜장1, "Mapo Tofu", "Spicy tofu dish from Sichuan province"),
            FoodItem(R.raw.짜장2, "Dumplings", "Small pieces of dough filled with meat and vegetables"),
            FoodItem(R.raw.짜장3, "Peking Duck", "Chinese dish of roast duck served with pancakes, scallions, and hoisin sauce"),
            // Add more Chinese food items as needed
        )

        val foodListOther = listOf(
            FoodItem(R.raw.메타몽, "Salad", "Mixture of vegetables, fruits, or grains"),
            FoodItem(R.raw.피카추, "Soup", "Liquid food prepared by boiling ingredients"),
            FoodItem(R.raw.세트메뉴, "Sandwich", "Food typically consisting of vegetables, sliced cheese or meat"),
            // Add more food items from other cuisines as needed
        )

        val layoutManagerKoreanFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_KoreanFood.layoutManager = layoutManagerKoreanFood
        recyclerview_KoreanFood.adapter = FoodAdapter(foodListKorean)

        val layoutManagerWesternFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_WesternFood.layoutManager = layoutManagerWesternFood
        recyclerview_WesternFood.adapter = FoodAdapter(foodListWestern)

        val layoutManagerJapaneseFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_JapaneseFood.layoutManager = layoutManagerJapaneseFood
        recyclerview_JapaneseFood.adapter = FoodAdapter(foodListJapanese)

        val layoutManagerChineseFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_ChineseFood.layoutManager = layoutManagerChineseFood
        recyclerview_ChineseFood.adapter = FoodAdapter(foodListChinese)

        val layoutManagerOtherFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview_OtherFood.layoutManager = layoutManagerOtherFood
        recyclerview_OtherFood.adapter = FoodAdapter(foodListOther)
    }
}
