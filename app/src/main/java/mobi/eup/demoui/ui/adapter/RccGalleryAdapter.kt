package mobi.eup.demoui.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mobi.eup.demoui.databinding.ItemSaveGalleryBinding
import mobi.eup.demoui.enum.GalleryType
import mobi.eup.demoui.extension.toGone
import mobi.eup.demoui.extension.toVisible
import mobi.eup.demoui.model.ItemGallery

/**
 * Created by Dinh Sam Vu on 5/6/2021.
 */
class RccGalleryAdapter(private val listItem: List<ItemGallery>) :
    RecyclerView.Adapter<RccGalleryAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemSaveGalleryBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemSaveGalleryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            ivGallery.setImageResource(listItem[position].src)
            tvName.text = listItem[position].name
            tvName.isSelected = true

            when (position) {
                0 -> {
                    layoutMedia.toGone()
                    layoutAddNew.toVisible()
                }
                5 -> {
                    layoutAddNew.toGone()
                    layoutName.toGone()
                    btnPlay.toGone()
                    layoutViewAll.toVisible()
                }
                else -> {
                    layoutViewAll.toGone()
                    layoutAddNew.toGone()
                    btnPlay.visibility =
                        if (listItem[position].type == GalleryType.AUDIO) GONE else VISIBLE
                }
            }
        }
    }

    override fun getItemCount(): Int = listItem.size
}