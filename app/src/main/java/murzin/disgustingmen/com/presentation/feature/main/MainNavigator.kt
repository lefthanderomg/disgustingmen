package murzin.disgustingmen.com.presentation.feature.main

import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.view.*
import murzin.disgustingmen.com.R
import murzin.disgustingmen.com.presentation.base.enum.navigation.MainScreens
import murzin.disgustingmen.com.presentation.feature.main.view.MainActivity
import ru.terrakok.cicerone.android.SupportAppNavigator
import javax.inject.Inject
//
//class MainNavigator @Inject constructor(
//       private val activity: MainActivity
//) : SupportAppNavigator(activity, activity.supportFragmentManager, R.id.container){
//
//
//    override fun createActivityIntent(context: Context?, screenKey: String?, data: Any?): Intent {
//
//    }
//
//
//    override fun createFragment(screenKey: String?, data: Any?): Fragment {
//       return when(screenKey) {
//            MainScreens.MAIN_SCREEN -> null
//            else -> null
//        }
//
//    }
//
//}