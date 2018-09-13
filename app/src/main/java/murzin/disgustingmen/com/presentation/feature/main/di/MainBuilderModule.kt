package murzin.disgustingmen.com.presentation.feature.main.di

import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector
import murzin.disgustingmen.com.di.PerFragment
import murzin.disgustingmen.com.presentation.feature.mainpage.di.MainpageModule
import murzin.disgustingmen.com.presentation.feature.mainpage.view.MainpageFragment

@Module(includes = [(AndroidInjectionModule::class)])
interface MainBuilderModule {

    @PerFragment
    @ContributesAndroidInjector(modules = [(MainpageModule::class)])
    fun provideMainPageFactory() : MainpageFragment
}