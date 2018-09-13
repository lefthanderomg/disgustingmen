package murzin.disgustingmen.com.domain.interactor

import io.reactivex.Single
import murzin.disgustingmen.com.domain.entity.DisgustingmenArticle
import murzin.disgustingmen.com.domain.repository.DisgustingmenRepository
import javax.inject.Inject

class GetMainContentUseCase @Inject constructor(
        private val repo: DisgustingmenRepository
) {

    fun getMainContent(): Single<List<DisgustingmenArticle>> = repo.getMainContent()
}