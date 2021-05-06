package mobi.eup.demoui.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mobi.eup.demoui.databinding.ItemNewThemeBinding
import mobi.eup.demoui.databinding.ItemTopFeaturesBinding
import mobi.eup.demoui.model.ItemFeature
import mobi.eup.demoui.model.ItemTheme

/**
 * Created by Dinh Sam Vu on 5/6/2021.
 */
class RccThemeAdapter(private val listTheme: List<ItemTheme>) :
    RecyclerView.Adapter<RccThemeAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemNewThemeBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemNewThemeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            ivNewTheme.setImageResource(listTheme[position].src)
            btnNewTheme.text = listTheme[position].name
        }
    }

    override fun getItemCount(): Int = listTheme.size
}