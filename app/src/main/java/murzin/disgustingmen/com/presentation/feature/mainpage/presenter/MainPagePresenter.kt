package murzin.disgustingmen.com.presentation.feature.mainpage.presenter

import com.arellomobile.mvp.InjectViewState
import murzin.disgustingmen.com.domain.interactor.GetMainContentUseCase
import murzin.disgustingmen.com.domain.provider.SchedulersProvider
import murzin.disgustingmen.com.presentation.base.ErrorHandlingPresenter
import murzin.disgustingmen.com.presentation.error.DefaultErrorHandler
import murzin.disgustingmen.com.presentation.feature.mainpage.mapper.DisgustingmenMapperUI
import murzin.disgustingmen.com.presentation.feature.mainpage.view.MainpageView
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MainPagePresenter @Inject constructor(
        private val router: Router,
        private val getMainContentUseCase: GetMainContentUseCase,
        override val errorHandler: DefaultErrorHandler,
        private val schedulers: SchedulersProvider,
        private val mapper: DisgustingmenMapperUI
) : ErrorHandlingPresenter<MainpageView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        getContent()
    }

    private fun getContent() {
        getMainContentUseCase
                .getMainContent()
                .subscribeOn(schedulers.io())
                .observeOn(schedulers.ui())
                .map { mapper.map(it) }
                .subscribe({ viewState.displayArticle(it)
                }, { errorHandler.proceed(it) })
                .also { addToDisposable(it) }
    }

}