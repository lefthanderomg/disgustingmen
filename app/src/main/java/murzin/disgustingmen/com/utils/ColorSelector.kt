package murzin.disgustingmen.com.utils

import android.content.Context
import murzin.disgustingmen.com.R
import javax.inject.Inject

class ColorSelector @Inject constructor(context : Context) {


    fun selecTagColor(tag: String): Int =
            when (tag) {
                "игры" -> R.color.colorAccent
                else -> R.color.white
            }

}