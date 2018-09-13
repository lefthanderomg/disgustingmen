package murzin.disgustingmen.com.presentation.feature.main.di

import dagger.Module
import dagger.Provides
import murzin.disgustingmen.com.di.PerActivity
import murzin.disgustingmen.com.presentation.feature.main.MainNavigator
import murzin.disgustingmen.com.presentation.feature.main.view.MainActivity
import ru.terrakok.cicerone.Navigator

@Module
class MainActivityModule {

    @PerActivity
    @Provides
    fun provideNavigator(activity: MainActivity): Navigator = MainNavigator(activity = activity)


}
