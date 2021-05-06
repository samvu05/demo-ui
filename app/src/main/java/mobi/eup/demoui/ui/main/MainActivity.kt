package mobi.eup.demoui.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mobi.eup.demoui.R
import mobi.eup.demoui.databinding.ActivityMainBinding
import mobi.eup.demoui.enum.GalleryType
import mobi.eup.demoui.extension.createListGallery
import mobi.eup.demoui.extension.createListSticker
import mobi.eup.demoui.extension.createListTheme
import mobi.eup.demoui.extension.getListFeatures
import mobi.eup.demoui.model.ItemFeature
import mobi.eup.demoui.model.ItemGallery
import mobi.eup.demoui.model.ItemSticker
import mobi.eup.demoui.model.ItemTheme
import mobi.eup.demoui.ui.adapter.RccFeaturesAdapter
import mobi.eup.demoui.ui.adapter.RccGalleryAdapter
import mobi.eup.demoui.ui.adapter.RccStickerAdapter
import mobi.eup.demoui.ui.adapter.RccThemeAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        setupRecyclerViews()
    }

    private fun setupRecyclerViews() {
        binding.apply {
            rvTopFeatures.apply {
                adapter = RccFeaturesAdapter(getListFeatures(), onClick = onFeatureClick)
            }

            rvNewStickers.apply {
                adapter = RccStickerAdapter(createListSticker())
            }

            rvNewThemes.apply {
                hasFixedSize()
                adapter = RccThemeAdapter(createListTheme())
            }

            rvSaveGallery.apply {
                hasFixedSize()
                adapter = RccGalleryAdapter(createListGallery())
            }
        }
    }

    private val onFeatureClick = fun(item: ItemFeature) {
        Toast.makeText(this@MainActivity, item.type.toString(), Toast.LENGTH_SHORT).show()
    }
}