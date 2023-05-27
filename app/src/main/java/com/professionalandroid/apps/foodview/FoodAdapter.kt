import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.professionalandroid.apps.foodview.FoodItem
import com.professionalandroid.apps.foodview.databinding.ItemFoodBinding

class FoodAdapter(private val foodList: List<FoodItem>) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding = ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentFood = foodList[position]
        holder.bind(currentFood)
    }

    override fun getItemCount() = foodList.size

    inner class FoodViewHolder(private val binding: ItemFoodBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(foodItem: FoodItem) {
            binding.ivFoodImage.setImageResource(foodItem.imageRes)
            binding.tvFoodName.text = foodItem.name
            binding.tvFoodDescription.text = foodItem.description
        }
    }
}
