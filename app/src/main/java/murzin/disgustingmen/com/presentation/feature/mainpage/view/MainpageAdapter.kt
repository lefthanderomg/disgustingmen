package murzin.disgustingmen.com.presentation.feature.mainpage.view

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_main_article.view.*
import murzin.disgustingmen.com.R
import murzin.disgustingmen.com.presentation.feature.mainpage.model.DisgustingmentArtilceUI
import murzin.disgustingmen.com.utils.ColorSelector
import murzin.disgustingmen.com.utils.extensions.addView
import murzin.disgustingmen.com.utils.extensions.inflate
import murzin.disgustingmen.com.utils.extensions.loadFromUrl
import javax.inject.Inject

class MainpageAdapter @Inject constructor(
        private val colorSelector: ColorSelector)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listArticle: MutableList<DisgustingmentArtilceUI> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder = ItemArticleViewHolder(p0)

    override fun getItemCount(): Int = listArticle.size


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as ItemArticleViewHolder
        holder.bindTo(listArticle[position])
    }

    inner class ItemArticleViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.item_main_article)) {

        fun bindTo(itemArticle: DisgustingmentArtilceUI) {
            with(itemView) {
                tv_title.text = itemArticle.title
                img_poster.loadFromUrl(itemArticle.imageUrl)
                chip_group.removeAllViews()
                itemArticle.categoryTag.forEach {
                    chip_group.addView(it)
                }
            }
        }

    }

    fun setArticle(articleFrom: MutableList<DisgustingmentArtilceUI>) {
        listArticle.addAll(articleFrom)
        notifyDataSetChanged()
    }

}




