package murzin.disgustingmen.com.presentation.feature.mainpage.di

import android.content.Context
import dagger.Module
import dagger.Provides
import murzin.disgustingmen.com.di.PerFragment
import murzin.disgustingmen.com.presentation.feature.mainpage.view.MainpageAdapter
import murzin.disgustingmen.com.utils.ColorSelector

@Module
class MainpageModule {

    @PerFragment
    @Provides
    fun provideColorSelector(context: Context) = ColorSelector(context)

    @PerFragment
    @Provides
    fun provideMainpageAdapter(colorSelector: ColorSelector) = MainpageAdapter(colorSelector)

}