package murzin.disgustingmen.com.data.parsed

import pl.droidsonroids.jspoon.annotation.Selector

class DisgustingmenArticle {

    @Selector(value = "div.content", defValue = "")
    var content : String = ""


}