package mobi.eup.demoui.extension

import android.view.View

/**
 * Created by Dinh Sam Vu on 5/6/2021.
 */
fun View.toVisible(): View {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
    return this
}

fun View.toInVisible(): View {
    if (visibility != View.INVISIBLE) {
        visibility = View.INVISIBLE
    }
    return this
}

fun View.toGone(): View {
    if (visibility != View.GONE) {
        visibility = View.GONE
    }
    return this
}
