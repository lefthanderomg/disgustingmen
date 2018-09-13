package murzin.disgustingmen.com.data.model.parsed

import pl.droidsonroids.jspoon.annotation.Selector

class DisgustingmenArticleParsed {

    @Selector(value = "div.content", defValue = "")
    var content : String = ""



}