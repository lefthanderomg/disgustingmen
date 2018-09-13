package murzin.disgustingmen.com.presentation.feature.mainpage.view

import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import murzin.disgustingmen.com.R
import murzin.disgustingmen.com.presentation.base.BaseFragment
import murzin.disgustingmen.com.presentation.feature.main.presenter.MainPresenter
import murzin.disgustingmen.com.presentation.feature.mainpage.presenter.MainPagePresenter
import javax.inject.Inject

class MainpageFragment : BaseFragment(), MainpageView {

    companion object {
        fun getNewInstance() : MainpageFragment = MainpageFragment()
    }

    @Inject
    @InjectPresenter
    lateinit var presenter: MainPagePresenter

    @ProvidePresenter
    fun provideMainpagerPresenter() = presenter



    override fun layoutRes(): Int = R.layout.fragment_main_page

}