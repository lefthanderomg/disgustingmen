package murzin.disgustingmen.com.presentation.feature.mainpage.view

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import murzin.disgustingmen.com.presentation.error.CanShowError

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainpageView : MvpView, CanShowError{
}