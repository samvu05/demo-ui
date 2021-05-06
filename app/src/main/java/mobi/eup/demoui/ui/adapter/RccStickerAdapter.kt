package mobi.eup.demoui.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mobi.eup.demoui.databinding.ItemNewStickerBinding
import mobi.eup.demoui.databinding.ItemTopFeaturesBinding
import mobi.eup.demoui.model.ItemFeature
import mobi.eup.demoui.model.ItemSticker

/**
 * Created by Dinh Sam Vu on 5/6/2021.
 */
class RccStickerAdapter(private val listSticker: List<ItemSticker>) :
    RecyclerView.Adapter<RccStickerAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemNewStickerBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemNewStickerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            imvSticker.setImageResource(listSticker[position].src)
            tvStickerName.text = listSticker[position].name
            tvStickersCount.text = "${listSticker[position].count} tickers"
        }
    }

    override fun getItemCount(): Int = listSticker.size
}