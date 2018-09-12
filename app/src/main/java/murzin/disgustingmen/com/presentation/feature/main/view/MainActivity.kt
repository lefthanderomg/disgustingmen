package murzin.disgustingmen.com.presentation.feature.main.view

import android.os.Bundle
import android.support.annotation.LayoutRes

import murzin.disgustingmen.com.R
import murzin.disgustingmen.com.presentation.base.BaseActivity
import murzin.disgustingmen.com.presentation.feature.main.view.MainView
import murzin.disgustingmen.com.presentation.feature.main.presenter.MainPresenter

import ru.terrakok.cicerone.Navigator

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter

import javax.inject.Inject


class MainActivity : BaseActivity(), MainView {

    @Inject
    @InjectPresenter
    lateinit var presenter: MainPresenter

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
