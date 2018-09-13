package murzin.disgustingmen.com.data.repository

import io.reactivex.Single
import murzin.disgustingmen.com.data.mapper.DisgustingmenMapper
import murzin.disgustingmen.com.data.network.AppApi
import murzin.disgustingmen.com.domain.entity.DisgustingmenArticle
import murzin.disgustingmen.com.domain.repository.DisgustingmenRepository
import javax.inject.Inject

class DisgustingmenRepositoryImpl @Inject constructor(
        private val mapper: DisgustingmenMapper,
        private val api: AppApi
) : DisgustingmenRepository {
    override fun getMainContent(): Single<List<DisgustingmenArticle>> =
            api.getMainPageArticle().map { mapper.map(it) }


}