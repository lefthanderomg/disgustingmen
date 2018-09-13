package murzin.disgustingmen.com.data.mapper

import murzin.disgustingmen.com.data.model.parsed.MainPageParsed
import murzin.disgustingmen.com.domain.entity.DisgustingmenArticle


import javax.inject.Inject

class DisgustingmenMapper @Inject constructor() {

    fun map(from: MainPageParsed): List<DisgustingmenArticle> =
            from.getMainPageArticle.map { articles ->
                DisgustingmenArticle(
                        content = articles.content,
                        author = articles.author,
                        categoryTag = articles.categoryTag,
                        imageUrl = articles.imgUrl,
                        time = articles.time,
                        title = articles.title
                )
            }
}