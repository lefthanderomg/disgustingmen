package murzin.disgustingmen.com.domain.entity

data class DisgustingmenArticle(var content: String,
                                var author: String,
                                var categoryTag: List<String>,
                                var imageUrl: String,
                                var time: String,
                                var title: String)