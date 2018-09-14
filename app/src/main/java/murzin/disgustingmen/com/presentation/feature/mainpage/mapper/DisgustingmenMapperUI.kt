package murzin.disgustingmen.com.presentation.feature.mainpage.mapper

import murzin.disgustingmen.com.domain.entity.DisgustingmenArticle
import murzin.disgustingmen.com.presentation.feature.mainpage.model.DisgustingmentArtilceUI
import javax.inject.Inject

class DisgustingmenMapperUI @Inject constructor() {

    fun map(from: List<DisgustingmenArticle>): List<DisgustingmentArtilceUI> =
            from.map { articles ->
                DisgustingmentArtilceUI(
                        content = articles.content,
                        author = articles.author,
                        categoryTag = articles.categoryTag,
                        imageUrl = articles.imageUrl,
                        time = articles.time,
                        title = articles.title
                )
            }
}