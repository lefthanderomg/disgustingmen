package murzin.disgustingmen.com.data.model.parsed

import pl.droidsonroids.jspoon.annotation.Selector

class DisgustingmenArticleParsed {

    @Selector(value = "div.content", defValue = "")
    var content: String = ""

    @Selector(value = "div.image > a > img", attr = "src", defValue = "")
    var imgUrl: String = ""

    @Selector(value = "article > h2 > a", defValue = "")
    var title: String = ""

    @Selector(value = "div.tags > a", defValue = "")
    var categoryTag: List<String> = emptyList()

    @Selector(value = "div.info > span.author.vcard > a", defValue = "")
    var author: String = ""

    @Selector(value = "div.info > time", defValue = "")
    var time: String = ""

}