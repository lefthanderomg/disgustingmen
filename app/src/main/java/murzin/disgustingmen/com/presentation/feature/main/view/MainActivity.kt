package murzin.disgustingmen.com.presentation.feature.main.view

import android.os.Bundle
import android.support.annotation.LayoutRes

import murzin.disgustingmen.com.R
import murzin.disgustingmen.com.presentation.base.BaseActivity
import murzin.disgustingmen.com.presentation.feature.main.presenter.MainPresenter

import ru.terrakok.cicerone.Navigator

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import murzin.disgustingmen.com.data.network.AppApi

import javax.inject.Inject


class MainActivity : BaseActivity(), MainView {

    @Inject
    @InjectPresenter
    lateinit var presenter: MainPresenter

    @Inject
    lateinit var api : AppApi

    private lateinit var compositeDisposable : CompositeDisposable

    @ProvidePresenter
    fun providePresenter(): MainPresenter = presenter


    override var navigator: Navigator = Navigator { }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @LayoutRes
    override fun layoutRes() = R.layout.activity_main

    override fun viewCreated() {

    }
}
