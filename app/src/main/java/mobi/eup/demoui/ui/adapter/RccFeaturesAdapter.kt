package mobi.eup.demoui.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mobi.eup.demoui.databinding.ItemTopFeaturesBinding
import mobi.eup.demoui.model.ItemFeature

/**
 * Created by Dinh Sam Vu on 5/6/2021.
 */
class RccFeaturesAdapter(
    private val listFeatures: List<ItemFeature>,
    private val onClick: (item: ItemFeature) -> Unit
) :
    RecyclerView.Adapter<RccFeaturesAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemTopFeaturesBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemTopFeaturesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            imvFeature.setOnClickListener {
                onClick(listFeatures[position])
            }
            imvFeature.setImageResource(listFeatures[position].src)
            tvNameFeatures.text = listFeatures[position].name
        }
    }

    override fun getItemCount(): Int = listFeatures.size
}