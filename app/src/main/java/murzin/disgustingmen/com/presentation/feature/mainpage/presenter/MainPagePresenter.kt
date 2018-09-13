package murzin.disgustingmen.com.presentation.feature.mainpage.presenter

import com.arellomobile.mvp.InjectViewState
import murzin.disgustingmen.com.domain.interactor.GetMainContentUseCase
import murzin.disgustingmen.com.domain.provider.SchedulersProvider
import murzin.disgustingmen.com.presentation.base.BasePresenter
import murzin.disgustingmen.com.presentation.base.ErrorHandlingPresenter
import murzin.disgustingmen.com.presentation.error.DefaultErrorHandler
import murzin.disgustingmen.com.presentation.error.ErrorHandler
import murzin.disgustingmen.com.presentation.feature.mainpage.view.MainpageView
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MainPagePresenter @Inject constructor(
        private val router: Router,
        private val getMainContentUseCase: GetMainContentUseCase,
        override val errorHandler : DefaultErrorHandler,
        private val schedulers: SchedulersProvider
) : ErrorHandlingPresenter<MainpageView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        getContent()
    }

    fun getContent() {
        getMainContentUseCase
                .getMainContent()
                .subscribeOn(schedulers.io())
                .observeOn(schedulers.ui())
                .subscribe({ article ->
                    
                }, { error -> errorHandler.proceed(error)})
                .also { addToDisposable(it) }
    }

}