package murzin.disgustingmen.com.presentation.feature.mainpage.view

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_main_article.view.*
import murzin.disgustingmen.com.R
import murzin.disgustingmen.com.presentation.feature.mainpage.model.DisgustingmentArtilceUI
import murzin.disgustingmen.com.utils.extensions.inflate
import murzin.disgustingmen.com.utils.extensions.loadFromUrl

class MainpageAdapter(private var listArticle: MutableList<DisgustingmentArtilceUI>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


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
            }
        }

    }

    fun setArticle(articleFrom : MutableList<DisgustingmentArtilceUI>) {
        listArticle.addAll(articleFrom)
        notifyDataSetChanged()
    }

}


