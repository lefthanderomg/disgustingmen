package murzin.disgustingmen.com.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import murzin.disgustingmen.com.App
import murzin.disgustingmen.com.di.PerApplication
import murzin.disgustingmen.com.domain.provider.SchedulersProvider
import murzin.disgustingmen.com.presentation.error.DefaultErrorHandler
import murzin.disgustingmen.com.utils.provider.AppSchedulersProvider
import org.xml.sax.ErrorHandler
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

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

    @PerApplication
    @Provides
    fun provideSchedulers(): SchedulersProvider = AppSchedulersProvider()



}
