package murzin.disgustingmen.com.presentation.feature.main.presenter

import murzin.disgustingmen.com.presentation.base.BasePresenter
import murzin.disgustingmen.com.presentation.feature.main.view.MainView

import com.arellomobile.mvp.InjectViewState

import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MainPresenter @Inject constructor(private val router: Router) : BasePresenter<MainView>() {



    fun openMainScreen() {

    }

}
