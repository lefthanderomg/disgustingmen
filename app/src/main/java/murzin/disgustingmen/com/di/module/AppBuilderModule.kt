package murzin.disgustingmen.com.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import murzin.disgustingmen.com.presentation.feature.main.di.MainViewModule
import murzin.disgustingmen.com.presentation.feature.main.view.MainActivity

@Module
interface AppBuilderModule {

    @ContributesAndroidInjector(modules = [MainViewModule::class])
    fun provideMainActivityFactory(): MainActivity
}