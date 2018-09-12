package murzin.disgustingmen.com.di.module

import android.content.Context

import murzin.disgustingmen.com.App
import murzin.disgustingmen.com.di.PerApplication

import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @PerApplication
    @Provides
    fun provideContext(application: App): Context = application

    @PerApplication
    @Provides
    fun provideCicerone(): Cicerone<Router> = Cicerone.create()

    @PerApplication
    @Provides
    fun provideNavigatorHolder(cicerone: Cicerone<Router>): NavigatorHolder = cicerone.navigatorHolder

    @PerApplication
    @Provides
    fun provideRouter(cicerone: Cicerone<Router>): Router = cicerone.router

}
