package murzin.disgustingmen.com.presentation.base

import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BasePresenter<View : MvpView> : MvpPresenter<View>() {

    private val disposable = CompositeDisposable()


    override fun detachView(view: View) {
        disposable.clear()
        super.detachView(view)

    }

    protected fun addToDisposable(disposable: Disposable) {
        this.disposable.add(disposable)
    }

}