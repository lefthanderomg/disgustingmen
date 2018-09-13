package murzin.disgustingmen.com.presentation.feature.main.presenter

import com.arellomobile.mvp.InjectViewState
import murzin.disgustingmen.com.presentation.base.BasePresenter
import murzin.disgustingmen.com.presentation.base.enum.navigation.MainScreens
import murzin.disgustingmen.com.presentation.feature.main.view.MainView
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class MainPresenter @Inject constructor(private val router: Router) : BasePresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        openMainScreen()
    }

    fun openMainScreen() {
        router.newRootScreen(MainScreens.MAIN_SCREEN)
    }


}
