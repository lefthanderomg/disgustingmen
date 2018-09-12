package murzin.disgustingmen.com.di

import murzin.disgustingmen.com.App

import murzin.disgustingmen.com.di.module.AppModule
import murzin.disgustingmen.com.di.module.NetworkModule
import murzin.disgustingmen.com.di.module.RxModule
import murzin.disgustingmen.com.di.module.AppBuilderModule

import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.AndroidInjector
import dagger.Component;

@PerApplication
@Component(modules = [AppModule::class, RxModule::class,
    NetworkModule::class,
    AppBuilderModule::class,
    AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

}