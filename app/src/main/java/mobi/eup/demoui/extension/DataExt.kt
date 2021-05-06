package mobi.eup.demoui.extension

import mobi.eup.demoui.R
import mobi.eup.demoui.enum.FeatureType
import mobi.eup.demoui.enum.GalleryType
import mobi.eup.demoui.model.ItemFeature
import mobi.eup.demoui.model.ItemGallery
import mobi.eup.demoui.model.ItemSticker
import mobi.eup.demoui.model.ItemTheme

/**
 * Created by Dinh Sam Vu on 5/6/2021.
 */

fun getListFeatures(): List<ItemFeature> {
    val listFeatures = mutableListOf<ItemFeature>()
    return listFeatures.apply {
        add(ItemFeature(R.drawable.ic_video_trimmer, "Video Trimmer", FeatureType.VIDEO_TRIMMER))
        add(ItemFeature(R.drawable.ic_video_joiner, "Video Joiner", FeatureType.VIDEO_JOINER))
        add(ItemFeature(R.drawable.ic_music, "Video MP3", FeatureType.VIDEO_MP3))
        add(ItemFeature(R.drawable.ic_crop, "Crop Video", FeatureType.CROP_VIDEO))
        add(ItemFeature(R.drawable.ic_filter, "Filter", FeatureType.FILTER))
        add(ItemFeature(R.drawable.ic_rotate, "Rotate Video", FeatureType.ROTATE_VIDEO))
        add(ItemFeature(R.drawable.ic_add_audio, "Add Audio", FeatureType.ADD_AUDIO))
        add(ItemFeature(R.drawable.ic_adjust, "Adjust", FeatureType.ADJUST))
        add(ItemFeature(R.drawable.ic_reverse, "Reverse", FeatureType.REVERSE))
        add(ItemFeature(R.drawable.ic_format, "Format", FeatureType.FORMAT))
        add(ItemFeature(R.drawable.ic_video_togif, "Video to GIF", FeatureType.VIDEO_TO_GIF))
        add(ItemFeature(R.drawable.ic_fast_slow, "Fast & Slow", FeatureType.FAST_N_SLOW))
    }
}

fun createListSticker(): List<ItemSticker> {
    val listSticker = mutableListOf<ItemSticker>()
    return listSticker.apply {
        add(ItemSticker(R.drawable.img_sticker1, "Animals", 90))
        add(ItemSticker(R.drawable.img_sticker2, "Birthday", 42))
        add(ItemSticker(R.drawable.img_sticker3, "Christmas", 59))
        add(ItemSticker(R.drawable.img_sticker4, "Sales", 25))
        add(ItemSticker(R.drawable.img_sticker5, "Fires", 45))
        add(ItemSticker(R.drawable.img_sticker6, "Dogs", 13))
        add(ItemSticker(R.drawable.img_sticker7, "Cats", 78))
    }
}

fun createListTheme(): List<ItemTheme> {
    val listTheme = mutableListOf<ItemTheme>()
    return listTheme.apply {
        add(ItemTheme(R.drawable.img_theme_1, "Chirstmas"))
        add(ItemTheme(R.drawable.img_theme_2, "Newyear"))
        add(ItemTheme(R.drawable.img_theme_3, "Travel"))
        add(ItemTheme(R.drawable.img_theme_4, "Sexy"))
        add(ItemTheme(R.drawable.img_theme_5, "Asian"))
        add(ItemTheme(R.drawable.img_theme_6, "Cool"))
        add(ItemTheme(R.drawable.img_theme_7, "Vintage"))
    }
}

fun createListGallery(): List<ItemGallery> {
    val listGallery = mutableListOf<ItemGallery>()
    return listGallery.apply {
        add(ItemGallery(R.drawable.bg_add_video, GalleryType.ADD_NEW, "video_1_a_recorded"))
        add(ItemGallery(R.drawable.img_theme_1, GalleryType.VIDEO, "audio_1_a_recorded"))
        add(ItemGallery(R.drawable.img_theme_3, GalleryType.AUDIO, "video_1_a_recorded"))
        add(ItemGallery(R.drawable.img_theme_2, GalleryType.VIDEO, "video_1_a_recorded"))
        add(ItemGallery(R.drawable.img_theme_4, GalleryType.AUDIO, "audio_1_a_recorded"))
        add(ItemGallery(R.drawable.img_theme_6, GalleryType.VIDEO, "video_1_a_recorded"))
    }
}