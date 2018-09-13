package murzin.disgustingmen.com.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import murzin.disgustingmen.com.di.PerActivity
import murzin.disgustingmen.com.presentation.feature.main.di.MainActivityModule
import murzin.disgustingmen.com.presentation.feature.main.di.MainBuilderModule
import murzin.disgustingmen.com.presentation.feature.main.view.MainActivity

@Module
interface AppBuilderModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [(MainActivityModule::class), (MainBuilderModule::class)])
    fun provideMainActivityFactory(): MainActivity
}