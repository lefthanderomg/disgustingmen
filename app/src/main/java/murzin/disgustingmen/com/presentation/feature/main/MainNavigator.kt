package murzin.disgustingmen.com.presentation.feature.main

import android.content.Context
import android.content.Intent
import murzin.disgustingmen.com.R
import murzin.disgustingmen.com.presentation.base.enum.navigation.MainScreens
import murzin.disgustingmen.com.presentation.feature.main.view.MainActivity
import murzin.disgustingmen.com.presentation.feature.mainpage.view.MainpageFragment
import ru.terrakok.cicerone.android.SupportAppNavigator
import javax.inject.Inject

class MainNavigator @Inject constructor(
        activity: MainActivity
) : SupportAppNavigator(activity, activity.supportFragmentManager, R.id.container) {

    override fun createActivityIntent(context: Context?, screenKey: String?, data: Any?) = null


    override fun createFragment(screenKey: String?, data: Any?) = when (screenKey) {
        MainScreens.MAIN_SCREEN -> MainpageFragment.getNewInstance()
        else -> MainpageFragment.getNewInstance()
    }


}