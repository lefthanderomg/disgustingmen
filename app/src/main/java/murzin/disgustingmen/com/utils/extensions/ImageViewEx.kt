package murzin.disgustingmen.com.utils.extensions

import android.widget.ImageView
import murzin.disgustingmen.com.utils.GlideApp


fun ImageView.loadFromUrl(url: String) {
    GlideApp.with(context).load(url.validateUrl())
            .centerCrop()
            .into(this)
}