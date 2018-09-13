package murzin.disgustingmen.com.presentation.base

import com.arellomobile.mvp.MvpView
import murzin.disgustingmen.com.presentation.error.CanShowError
import murzin.disgustingmen.com.presentation.error.ErrorHandler

abstract class ErrorHandlingPresenter<View> : BasePresenter<View>() where View : MvpView,
                                                                          View : CanShowError {
    abstract val errorHandler: ErrorHandler

    override fun detachView(view: View) {
        super.detachView(view)
        errorHandler.detachView()
    }

    override fun attachView(view: View) {
        super.attachView(view)
        errorHandler.attachView(view)
    }
}