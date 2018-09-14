package murzin.disgustingmen.com.utils.extensions

import android.support.design.chip.Chip
import android.support.design.chip.ChipGroup

fun ChipGroup.addView(tag: String) {
    val chip = Chip(context)
    with(chip) {
        text = tag
    }
    this.addView(chip)
}