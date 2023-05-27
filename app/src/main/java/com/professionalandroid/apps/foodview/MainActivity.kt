package com.professionalandroid.apps.foodview

import FoodAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.professionalandroid.apps.foodview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterKoreanFood: FoodAdapter
    private lateinit var adapterWesternFood: FoodAdapter
    private lateinit var adapterJapaneseFood: FoodAdapter
    private lateinit var adapterChineseFood: FoodAdapter
    private lateinit var adapterOtherFood: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodListKorean = listOf(
            FoodItem(R.raw.a, "Bibimbap", "Traditional Korean mixed rice dish"),
            FoodItem(R.raw.a2, "Kimchi", "Spicy fermented cabbage"),
            FoodItem(R.raw.a3, "Japchae", "Stir-fried glass noodles with vegetables"),
            // Add more Korean food items as needed
        )

        val foodListWestern = listOf(
            FoodItem(R.raw.a4, "Pizza", "Italian dish with a savory bread crust topped with cheese and various toppings"),
            FoodItem(R.raw.a5, "Burger", "Sandwich consisting of a cooked patty of ground meat"),
            FoodItem(R.raw.a6, "Pasta", "Italian dish made from an unleavened dough of durum wheat flour"),
            // Add more Western food items as needed
        )

        val foodListJapanese = listOf(
            FoodItem(R.raw.a11, "Sushi", "Japanese dish consisting of vinegared rice and various ingredients"),
            FoodItem(R.raw.a8, "Ramen", "Japanese noodle soup dish"),
            FoodItem(R.raw.a9, "Tempura", "Japanese dish of battered and deep-fried seafood or vegetables"),
            // Add more Japanese food items as needed
        )

        val foodListChinese = listOf(
            FoodItem(R.raw.a12, "Mapo Tofu", "Spicy tofu dish from Sichuan province"),
            FoodItem(R.raw.a13, "Dumplings", "Small pieces of dough filled with meat and vegetables"),
            FoodItem(R.raw.a14, "Peking Duck", "Chinese dish of roast duck served with pancakes, scallions, and hoisin sauce"),
            // Add more Chinese food items as needed
        )

        val foodListOther = listOf(
            FoodItem(R.raw.a15, "Salad", "Mixture of vegetables, fruits, or grains"),
            FoodItem(R.raw.a16, "Soup", "Liquid food prepared by boiling ingredients"),
            FoodItem(R.raw.a18, "Sandwich", "Food typically consisting of vegetables, sliced cheese or meat"),
            // Add more food items from other cuisines as needed
        )

        val layoutManagerKoreanFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerviewKoreanFood.layoutManager = layoutManagerKoreanFood
        adapterKoreanFood = FoodAdapter(foodListKorean)
        binding.recyclerviewKoreanFood.adapter = adapterKoreanFood

        val layoutManagerWesternFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerviewWesternFood.layoutManager = layoutManagerWesternFood
        adapterWesternFood = FoodAdapter(foodListWestern)
        binding.recyclerviewWesternFood.adapter = adapterWesternFood

        val layoutManagerJapaneseFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerviewJapaneseFood.layoutManager = layoutManagerJapaneseFood
        adapterJapaneseFood = FoodAdapter(foodListJapanese)
        binding.recyclerviewJapaneseFood.adapter = adapterJapaneseFood

        val layoutManagerChineseFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerviewChineseFood.layoutManager = layoutManagerChineseFood
        adapterChineseFood = FoodAdapter(foodListChinese)
        binding.recyclerviewChineseFood.adapter = adapterChineseFood

        val layoutManagerOtherFood = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerviewOtherFood.layoutManager = layoutManagerOtherFood
        adapterOtherFood = FoodAdapter(foodListOther)
        binding.recyclerviewOtherFood.adapter = adapterOtherFood
    }
}
