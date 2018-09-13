package murzin.disgustingmen.com.data.model.parsed

import pl.droidsonroids.jspoon.annotation.Selector

class MainPageParsed {

    @Selector(value = "div.post_item.new_post_item")
    var getMainPageArticle: List<DisgustingmenArticleParsed> = emptyList()
}