package murzin.disgustingmen.com.presentation.feature.mainpage.presenter

import com.arellomobile.mvp.InjectViewState
import murzin.disgustingmen.com.presentation.base.BasePresenter
import murzin.disgustingmen.com.presentation.feature.mainpage.view.MainpageView
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MainPagePresenter @Inject constructor(private val router: Router)
    : BasePresenter<MainpageView>() {

}