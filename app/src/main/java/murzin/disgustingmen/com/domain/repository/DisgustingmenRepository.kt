package murzin.disgustingmen.com.domain.repository

import io.reactivex.Single
import murzin.disgustingmen.com.domain.entity.DisgustingmenArticle

interface DisgustingmenRepository {

    fun getMainContent(): Single<List<DisgustingmenArticle>>
}