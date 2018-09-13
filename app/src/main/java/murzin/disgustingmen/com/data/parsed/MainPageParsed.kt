package murzin.disgustingmen.com.data.parsed

import pl.droidsonroids.jspoon.annotation.Selector

class MainPageParsed {

    @Selector(value = "div.post_item.new_post_item")
    var getMainPageArticle: List<DisgustingmenArticle> = emptyList()
}